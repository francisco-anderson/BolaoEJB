/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.dao;

import com.bm.bolaoservice.entity.EquipePartida;
import com.bm.bolaoservice.entity.EquipePartidaPK;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Anderson
 */
public class EquipePartidaDAO {
    
    private EntityManager em;
    
    public EquipePartidaDAO(EntityManager em){
        this.em=em;
    }
    
    public EquipePartida save(EquipePartida e){
        if(e.getEquipePartidaPK().getIdEquipe()!=null && e.getEquipePartidaPK().getIdPartida()!=null){
            return em.merge(e);
        } else {
            em.persist(e);
            return e;
        }
    }
    
    public void remover(EquipePartidaPK id){
       EquipePartida entity = this.find(id);
       em.remove(entity);
    }
    
    public EquipePartida find (EquipePartidaPK id){
        return em.find(EquipePartida.class, id);
    }
    
    public List<EquipePartida> buscarPorEquipe(Long id){
        Query query = em.createNamedQuery("EquipePartida.findByIdEquipe");
        query.setParameter("idEquipe", id);
        return query.getResultList();
    }
    
    public List<EquipePartida> buscarPorPartida(Long id){
        Query query = em.createNamedQuery("EquipePartida.findByIdPartida");
        query.setParameter("idPartida", id);
        return query.getResultList();
    }
    
    public List<EquipePartida> findAll(){
        Query query = em.createNamedQuery("EquipePartida.findAll");
        return query.getResultList();
    }
    
}
