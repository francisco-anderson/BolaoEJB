/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Anderson
 */
@Entity
@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "APO_SEQ", sequenceName = "APOSTA_SEQ")
public class Aposta implements AbstractEntity {

    private static final long serialVersionUID = 3858559331989964654L;
    
    @Id
    @GeneratedValue(generator = "APO_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_APOSTA")
    private Long id;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_APOSTA")
    private Date dataAposta;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "USUARIO_APOSTA",
                joinColumns = @JoinColumn(name = "ID_APOSTA"),
                inverseJoinColumns = @JoinColumn(name = "ID_USUARIO"))
    private List<Usuario> usuarios;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_APOSTA")
    private ApostaEquipePartida apostaEquipePartida;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataAposta() {
        return dataAposta;
    }

    public void setDataAposta(Date dataAposta) {
        this.dataAposta = dataAposta;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ApostaEquipePartida getApostaEquipePartida() {
        return apostaEquipePartida;
    }

    public void setApostaEquipePartida(ApostaEquipePartida apostaEquipePartida) {
        this.apostaEquipePartida = apostaEquipePartida;
    }

}
