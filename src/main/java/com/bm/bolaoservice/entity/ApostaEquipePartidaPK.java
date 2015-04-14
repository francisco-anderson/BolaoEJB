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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Anderson
 */
@XmlRootElement
@Embeddable
public class ApostaEquipePartidaPK implements Serializable {

    private static final long serialVersionUID = 7910107273833917552L;

    @Basic(optional = false)
    @Column(name = "ID_APOSTA")
    private Long idAposta;
    @Basic(optional = false)
    @Column(name = "ID_PARTIDA")
    private Long idPartida;
    @Basic(optional = false)
    @Column(name = "ID_EQUIPE")
    private Long idEquipe;

    public ApostaEquipePartidaPK() {
    }

    public ApostaEquipePartidaPK(Long idAposta, Long idPartida, Long idEquipe) {
        this.idAposta = idAposta;
        this.idPartida = idPartida;
        this.idEquipe = idEquipe;
    }

    public Long getIdAposta() {
        return idAposta;
    }

    public void setIdAposta(Long idAposta) {
        this.idAposta = idAposta;
    }

    public Long getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Long idPartida) {
        this.idPartida = idPartida;
    }

    public Long getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

}
