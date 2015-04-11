/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Anderson
 */
@Table(name = "APOSTA_EQUIPE_PARTIDA")
public class ApostaEquipePartida implements Serializable {

    private static final long serialVersionUID = -5508100380517081748L;

    @Column(name = "GOLS")
    private int gol;
    @Column(name = "GOLS_PENALTI")
    private int golPenalti;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Equipe equipe;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Partida partida;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Aposta aposta;

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public int getGolPenalti() {
        return golPenalti;
    }

    public void setGolPenalti(int golPenalti) {
        this.golPenalti = golPenalti;
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

    public Aposta getAposta() {
        return aposta;
    }

    public void setAposta(Aposta aposta) {
        this.aposta = aposta;
    }
   

}
