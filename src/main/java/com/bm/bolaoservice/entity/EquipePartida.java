/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Anderson
 */
@Table(name = "EQUIPE_PARTIDA")
public class EquipePartida implements Serializable{

    private static final long serialVersionUID = -3182922397635831126L;

    @Column(name = "GOLS")
    private int gol;
    @Column(name = "GOLS_PENALTI")
    private int golPenati;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Equipe equipe;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Partida partida;

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public int getGolPenati() {
        return golPenati;
    }

    public void setGolPenati(int golPenati) {
        this.golPenati = golPenati;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

 

}
