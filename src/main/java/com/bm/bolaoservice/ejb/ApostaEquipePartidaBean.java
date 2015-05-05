/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.ejb;

import com.bm.bolaoservice.dao.ApostaEquipePartidaDAO;
import com.bm.bolaoservice.entity.ApostaEquipePartida;
import com.bm.bolaoservice.entity.ApostaEquipePartidaPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anderson
 */
@Stateless
public class ApostaEquipePartidaBean implements ApostaEquipePartidaRemote {

    private static final long serialVersionUID = 600675813423842596L;
    
    @PersistenceContext(unitName = "persistencia")
    private EntityManager em;

    @Override
    public ApostaEquipePartida buscarPorId(Long idAposta, Long Equipe, Long Partida) {
        ApostaEquipePartidaDAO dao = new ApostaEquipePartidaDAO(em);
        return dao.find(new ApostaEquipePartidaPK(idAposta, Partida, Equipe));
    }

    @Override
    public List<ApostaEquipePartida> buscarPorAposta(Long id) {
        ApostaEquipePartidaDAO dao = new ApostaEquipePartidaDAO(em);
        return dao.buscarPorAposta(id);
    }

    @Override
    public List<ApostaEquipePartida> buscarPorEquipe(Long id) {
        ApostaEquipePartidaDAO dao = new ApostaEquipePartidaDAO(em);
        return dao.buscarPorEquipe(id);
    }

    @Override
    public List<ApostaEquipePartida> buscarPorPartida(Long id) {
        ApostaEquipePartidaDAO dao = new ApostaEquipePartidaDAO(em);
        return dao.buscarPorPartida(id);
    }

    @Override
    public ApostaEquipePartida salvar(ApostaEquipePartida apostaEquipePartida) {
        ApostaEquipePartidaDAO dao = new ApostaEquipePartidaDAO(em);
        return dao.save(apostaEquipePartida);
    }

    @Override
    public List<ApostaEquipePartida> buscarPorEquipePartida(Long idEquipe, Long idPartida) {
        ApostaEquipePartidaDAO dao = new ApostaEquipePartidaDAO(em);
        return  dao.buscarPorEquipePartida(idEquipe, idPartida);
    }

}
