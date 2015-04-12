/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Anderson
 */
@Entity
@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "REG_SEQ", sequenceName = "REGRA_SEQ")
@NamedQueries({
    @NamedQuery(name = "Regra.findAll", query = "SELECT r FROM Regra r"),
    @NamedQuery(name = "Regra.findByIdRegra", query = "SELECT r FROM Regra r WHERE r.id = :idRegra"),
    @NamedQuery(name = "Regra.findByNome", query = "SELECT r FROM Regra r WHERE r.nome = :nome"),
    @NamedQuery(name = "Regra.findByPontos", query = "SELECT r FROM Regra r WHERE r.pontos = :pontos")})
public class Regra implements AbstractEntity {

    private static final long serialVersionUID = 1206699625039067780L;

    @Id
    @GeneratedValue(generator = "REG_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_REGRA")
    private Long id;
    private String nome;
    private int pontos;
    @JoinColumn(name = "ID_CAMPEONATO", referencedColumnName = "ID_CAMPEONATO")
    @ManyToOne
    private Campeonato campeonato;

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

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

}
