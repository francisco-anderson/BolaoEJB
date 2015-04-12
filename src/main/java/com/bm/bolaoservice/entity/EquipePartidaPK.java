/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Anderson
 */
@Embeddable
public class EquipePartidaPK implements Serializable {

    private static final long serialVersionUID = -1401272885393689393L;

    @Basic(optional = false)
    @Column(name = "ID_EQUIPE")
    private Long idEquipe;
    @Basic(optional = false)
    @Column(name = "ID_PARTIDA")
    private Long idPartida;
    
    public EquipePartidaPK() {
    }

    public EquipePartidaPK(Long idEquipe, Long idPartida) {
        this.idEquipe = idEquipe;
        this.idPartida = idPartida;
    }


    public Long getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Long getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Long idPartida) {
        this.idPartida = idPartida;
    }
}
