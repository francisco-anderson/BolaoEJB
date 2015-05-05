/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.dao;

import com.bm.bolaoservice.entity.PontuacaoEquipe;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Anderson
 */
public class PontuacaoEquipeDAO extends AbstractPersistence<PontuacaoEquipe, Long>{
    
    private EntityManager em;

    public PontuacaoEquipeDAO(EntityManager em) {
        super(PontuacaoEquipe.class);
        this.em=em;
    }

    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }
    
    public List<PontuacaoEquipe> buscarPorEquipe(Long id){
        Query query = em.createNamedQuery("PontuacaoEquipe.findByEquipe");
        query.setParameter("idEquipe", id);
        return query.getResultList();
    }
    
    public List<PontuacaoEquipe> buscarPorCampeonato(Long id){
        Query query = em.createNamedQuery("PontuacaoEquipe.findByCampeonato");
        query.setParameter("idCampeonato", id);
        return  query.getResultList();
    }
    
    public PontuacaoEquipe buscarPorCampeonatoEquipe(Long idCampeonato,Long idEquipe){
        Query query = em.createNamedQuery("PontuacaoEquipe.findByEquipeAndCampeonato");
        query.setParameter("idCampeonato", idCampeonato);
        query.setParameter("idEquipe", idEquipe);
        try{
        return (PontuacaoEquipe) query.getSingleResult();
        } catch (NoResultException ex){
            return null;
        }
    } 
    
}
