/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Anderson
 */
@XmlRootElement
@Table(name = "EQUIPE_PARTIDA")
@Entity
@NamedQueries({
    @NamedQuery(name = "EquipePartida.findAll", query = "SELECT e FROM EquipePartida e"),
    @NamedQuery(name = "EquipePartida.findByGols", query = "SELECT e FROM EquipePartida e WHERE e.gol = :gols"),
    @NamedQuery(name = "EquipePartida.findByGolsPenalti", query = "SELECT e FROM EquipePartida e WHERE e.golPenalti = :golsPenalti"),
    @NamedQuery(name = "EquipePartida.findByIdEquipe", query = "SELECT e FROM EquipePartida e WHERE e.equipePartidaPK.idEquipe = :idEquipe"),
    @NamedQuery(name = "EquipePartida.findByIdPartida", query = "SELECT e FROM EquipePartida e WHERE e.equipePartidaPK.idPartida = :idPartida")})
public class EquipePartida implements Serializable {

    private static final long serialVersionUID = -3182922397635831126L;

    @EmbeddedId
    protected EquipePartidaPK equipePartidaPK;
    @Column(name = "GOLS")
    private Integer gol;
    @Column(name = "GOLS_PENALTI")
    private Integer golPenalti;

    public EquipePartida() {
    }

    public EquipePartida(EquipePartidaPK equipePartidaPK) {
        this.equipePartidaPK = equipePartidaPK;
    }

    public EquipePartida(Long idEquipe, Long idPartida) {
        this.equipePartidaPK = new EquipePartidaPK(idEquipe, idPartida);
    }

    public EquipePartidaPK getEquipePartidaPK() {
        return equipePartidaPK;
    }

    public void setEquipePartidaPK(EquipePartidaPK equipePartidaPK) {
        this.equipePartidaPK = equipePartidaPK;
    }

    public Integer getGol() {
        return gol;
    }

    public void setGol(Integer gol) {
        this.gol = gol;
    }

    public Integer getGolPenalti() {
        return golPenalti;
    }

    public void setGolPenalti(Integer golPenalti) {
        this.golPenalti = golPenalti;
    }

}
