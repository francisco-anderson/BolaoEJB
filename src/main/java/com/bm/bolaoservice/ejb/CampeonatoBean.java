/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.ejb;

import com.bm.bolaoservice.dao.CampeonatoDAO;
import com.bm.bolaoservice.entity.Campeonato;
import com.bm.bolaoservice.entity.Usuario;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anderson
 */
@Stateless
public class CampeonatoBean implements CampeonatoRemote {

    @PersistenceContext(unitName = "persistencia")
    private EntityManager em;

    private static final long serialVersionUID = -2716769726269694235L;

    @Override
    public Campeonato consultaPorId(Long id) {
        CampeonatoDAO dao = new CampeonatoDAO(em);
        return dao.find(id);
    }

    @Override
    public List<Campeonato> buscarPorNome(String nome) {
        CampeonatoDAO dao = new CampeonatoDAO(em);
        return dao.buscarCampeonatoNome(nome);
    }

    @Override
    public List<Campeonato> buscarPorDatainicioStatus(Date datacomeço, Date datafim, String status) {
        CampeonatoDAO dao = new CampeonatoDAO(em);
        return dao.buscarCampeonatosPorDataStatus(datacomeço, datafim, status);
    }

    @Override
    public List<Campeonato> buscarPorStatus(String status) {
        CampeonatoDAO dao = new CampeonatoDAO(em);
        return dao.buscarCampeonatoPorStatus(status);
    }

    @Override
    public List<Campeonato> buscarPorUsuario(Usuario usuario) {
        CampeonatoDAO dao = new CampeonatoDAO(em);
        return dao.buscarCampeonatoPorUsuario(usuario.getId());
    }

}
