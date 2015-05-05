/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.ejb;

import com.bm.bolaoservice.dao.EquipePartidaDAO;
import com.bm.bolaoservice.entity.EquipePartida;
import com.bm.bolaoservice.entity.EquipePartidaPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anderson
 */
@Stateless
public class EquipePartidaBean implements EquipePartidaRemote {

    private static final long serialVersionUID = -4478206095350788909L;

    @PersistenceContext(unitName = "persistencia")
    private EntityManager em;

    @Override
    public EquipePartida buscarPorId(Long idEquipe, Long idPartida) {
        EquipePartidaDAO dao = new EquipePartidaDAO(em);
        return dao.find(new EquipePartidaPK(idEquipe, idPartida));
    }

    @Override
    public List<EquipePartida> buscarPorEquipe(Long id) {
        EquipePartidaDAO dao = new EquipePartidaDAO(em);
        return dao.buscarPorEquipe(id);
    }

    @Override
    public List<EquipePartida> buscarPorPartida(Long id) {
        EquipePartidaDAO dao = new EquipePartidaDAO(em);
        return dao.buscarPorPartida(id);
    }

    @Override
    public EquipePartida salvar(EquipePartida equipePartida) {
        EquipePartidaDAO dao = new EquipePartidaDAO(em);
        return dao.save(equipePartida);
    }

}
