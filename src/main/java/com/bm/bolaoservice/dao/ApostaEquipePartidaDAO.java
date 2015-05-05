/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.dao;

import com.bm.bolaoservice.entity.ApostaEquipePartida;
import com.bm.bolaoservice.entity.ApostaEquipePartidaPK;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Anderson
 */
public class ApostaEquipePartidaDAO {
    
    private EntityManager em;
    
    public ApostaEquipePartidaDAO(EntityManager em){
        this.em=em;
    }
    
    public ApostaEquipePartida save(ApostaEquipePartida e){
        if(e.getApostaEquipePartidaPK().getIdAposta()!=null && e.getApostaEquipePartidaPK().getIdEquipe()!=null && e.getApostaEquipePartidaPK().getIdPartida()!=null){
            return em.merge(e);
        } else {
            em.persist(e);
            return e;
        }
    }
    
    public ApostaEquipePartida find (ApostaEquipePartidaPK id){
        return em.find(ApostaEquipePartida.class, id);
    }
    
    public void remove(ApostaEquipePartidaPK id){
        ApostaEquipePartida a = this.find(id);
        em.remove(a);
    }
    
    public List<ApostaEquipePartida> findAll(){
        Query query = em.createNamedQuery("ApostaEquipePartida.findAll");
        return query.getResultList();
    }
    
    public List<ApostaEquipePartida> buscarPorAposta(Long id){
        Query query = em.createNamedQuery("ApostaEquipePartida.findByIdAposta");
        query.setParameter("idAposta", id);
        return query.getResultList();
    }
    
    public List<ApostaEquipePartida> buscarPorEquipe(Long id){
        Query query = em.createNamedQuery("ApostaEquipePartida.findByIdEquipe");
        query.setParameter("idEquipe", id);
        return query.getResultList();
    }
    
    public List<ApostaEquipePartida> buscarPorPartida(Long id){
        Query query = em.createNamedQuery("ApostaEquipePartida.findByIdPartida");
        query.setParameter("idPartida", id);
        return query.getResultList();
    }
    
    public List<ApostaEquipePartida> buscarPorEquipePartida(Long idEquipe,Long idPartida){
        Query query = em.createNamedQuery("ApostaEquipePartida.findByIdEquipeAndPartida");
        query.setParameter("idEquipe", idEquipe);
        query.setParameter("idPartida", idPartida);
        return query.getResultList();
    }
    
}
