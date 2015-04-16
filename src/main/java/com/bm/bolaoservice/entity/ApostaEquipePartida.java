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
@Entity
@Table(name = "APOSTA_EQUIPE_PARTIDA")
@NamedQueries({
    @NamedQuery(name = "ApostaEquipePartida.findAll", query = "SELECT a FROM ApostaEquipePartida a"),
    @NamedQuery(name = "ApostaEquipePartida.findByGols", query = "SELECT a FROM ApostaEquipePartida a WHERE a.gol = :gols"),
    @NamedQuery(name = "ApostaEquipePartida.findByGolsPenalti", query = "SELECT a FROM ApostaEquipePartida a WHERE a.golPenalti = :golsPenalti"),
    @NamedQuery(name = "ApostaEquipePartida.findByIdAposta", query = "SELECT a FROM ApostaEquipePartida a WHERE a.apostaEquipePartidaPK.idAposta = :idAposta"),
    @NamedQuery(name = "ApostaEquipePartida.findByIdPartida", query = "SELECT a FROM ApostaEquipePartida a WHERE a.apostaEquipePartidaPK.idPartida = :idPartida"),
    @NamedQuery(name = "ApostaEquipePartida.findByIdEquipe", query = "SELECT a FROM ApostaEquipePartida a WHERE a.apostaEquipePartidaPK.idEquipe = :idEquipe")})
public class ApostaEquipePartida implements Serializable {

    private static final long serialVersionUID = -5508100380517081748L;

    @EmbeddedId
    protected ApostaEquipePartidaPK apostaEquipePartidaPK;
    @Column(name = "GOLS")
    private Integer gol;
    @Column(name = "GOLS_PENALTI")
    private Integer golPenalti;

    public ApostaEquipePartida() {
    }

    public ApostaEquipePartida(ApostaEquipePartidaPK apostaEquipePartidaPK) {
        this.apostaEquipePartidaPK = apostaEquipePartidaPK;
    }

    public ApostaEquipePartida(ApostaEquipePartidaPK apostaEquipePartidaPK, int gol) {
        this.apostaEquipePartidaPK = apostaEquipePartidaPK;
        this.gol = gol;
    }

    public ApostaEquipePartida(Long idAposta, Long idPartida, Long idEquipe) {
        this.apostaEquipePartidaPK = new ApostaEquipePartidaPK(idAposta, idPartida, idEquipe);
    }

    public ApostaEquipePartidaPK getApostaEquipePartidaPK() {
        return apostaEquipePartidaPK;
    }

    public void setApostaEquipePartidaPK(ApostaEquipePartidaPK apostaEquipePartidaPK) {
        this.apostaEquipePartidaPK = apostaEquipePartidaPK;
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
