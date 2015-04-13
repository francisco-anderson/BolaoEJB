/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Anderson
 */
@Entity
@SequenceGenerator(name = "CAM_SEQ", sequenceName = "CAMPEONATO_SEQ", allocationSize = 1, initialValue = 1)
@NamedQueries({
    @NamedQuery(name = "Campeonato.findAll", query = "SELECT c FROM Campeonato c"),
    @NamedQuery(name = "Campeonato.findByIdCampeonato", query = "SELECT c FROM Campeonato c WHERE c.id = :idCampeonato"),
    @NamedQuery(name = "Campeonato.findByNome", query = "SELECT c FROM Campeonato c WHERE c.nome = :nome"),
    @NamedQuery(name = "Campeonato.findByQtdEquipe", query = "SELECT c FROM Campeonato c WHERE c.qtdEquipe = :qtdEquipe"),
    @NamedQuery(name = "Campeonato.findByDatainicio", query = "SELECT c FROM Campeonato c WHERE c.dataInicio = :datainicio"),
    @NamedQuery(name = "Campeonato.findByDatafinal", query = "SELECT c FROM Campeonato c WHERE c.dataFinal = :datafinal"),
    @NamedQuery(name = "Campeonato.findByStatus", query = "SELECT c FROM Campeonato c WHERE c.status = :status")})
public class Campeonato implements AbstractEntity {

    private static final long serialVersionUID = -542156336692445325L;

    @Id
    @GeneratedValue(generator = "CAM_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_CAMPEONATO")
    private Long id;
    private String nome;
    @Column(name = "QTD_EQUIPE")
    private int qtdEquipe;
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Temporal(TemporalType.DATE)
    private Date dataFinal;
    private String status;
    @OneToMany(mappedBy = "campeonato",fetch = FetchType.EAGER)
    private List<Pontuacao> pontuacaoList;
    @OneToMany(mappedBy = "campeonato",fetch = FetchType.EAGER)
    private List<Regra> regraList;
    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    private Usuario usuario;
    @OneToMany(mappedBy = "campeonato",fetch = FetchType.EAGER)
    private List<Partida> partidaList;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEquipe() {
        return qtdEquipe;
    }

    public void setQtdEquipe(int qtdEquipe) {
        this.qtdEquipe = qtdEquipe;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Pontuacao> getPontuacaoList() {
        return pontuacaoList;
    }

    public void setPontuacaoList(List<Pontuacao> pontuacaoList) {
        this.pontuacaoList = pontuacaoList;
    }

    public List<Regra> getRegraList() {
        return regraList;
    }

    public void setRegraList(List<Regra> regraList) {
        this.regraList = regraList;
    }

    public List<Partida> getPartidaList() {
        return partidaList;
    }

    public void setPartidaList(List<Partida> partidaList) {
        this.partidaList = partidaList;
    }

}
