/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Anderson
 */
@Entity
@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "PAR_SEQ", sequenceName = "PARTIDA_SEQ")
public class Partida implements AbstractEntity {

    private static final long serialVersionUID = 6073361808409878750L;

    @Id
    @GeneratedValue(generator = "PAR_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_PARTIDA")
    private Long id;
    private String fase;
    private String tipo;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_PARTIDA")
    private Date dataPartida;
    @Column(name = "LOCAL_PARTIDA")
    private String localPartida;
    private String status;
    @OneToMany
    @JoinColumn(name = "ID_PARTIDA")
    private EquipePartida equipePartida;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EquipePartida getEquipePartida() {
        return equipePartida;
    }

    public void setEquipePartida(EquipePartida equipePartida) {
        this.equipePartida = equipePartida;
    }
    

}
