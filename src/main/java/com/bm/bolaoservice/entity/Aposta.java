/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import java.util.Date;
import java.util.List;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Anderson
 */
@XmlRootElement
@Entity
@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "APO_SEQ", sequenceName = "APOSTA_SEQ")
@NamedQueries({
    @NamedQuery(name = "Aposta.findAll", query = "SELECT a FROM Aposta a"),
    @NamedQuery(name = "Aposta.findByIdAposta", query = "SELECT a FROM Aposta a WHERE a.id = :idAposta"),
    @NamedQuery(name = "Aposta.findByDataAposta", query = "SELECT a FROM Aposta a WHERE a.dataAposta = :dataAposta")})
public class Aposta implements AbstractEntity {

    private static final long serialVersionUID = 3858559331989964654L;

    @Id
    @GeneratedValue(generator = "APO_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_APOSTA")
    private Long id;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_APOSTA")
    private Date dataAposta;    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_APOSTA", referencedColumnName = "ID_APOSTA", insertable = false, updatable = false)
    private List<ApostaEquipePartida> apostaEquipePartidaList;

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


    public List<ApostaEquipePartida> getApostaEquipePartidaList() {
        return apostaEquipePartidaList;
    }

    public void setApostaEquipePartidaList(List<ApostaEquipePartida> apostaEquipePartidaList) {
        this.apostaEquipePartidaList = apostaEquipePartidaList;
    }

  
 

}
