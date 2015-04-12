/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import javax.persistence.CascadeType;
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
@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "PON_SEQ", sequenceName = "PONTUACAO_SEQ")
@NamedQueries({
    @NamedQuery(name = "Pontuacao.findAll", query = "SELECT p FROM Pontuacao p"),
    @NamedQuery(name = "Pontuacao.findByIdPontuacao", query = "SELECT p FROM Pontuacao p WHERE p.id = :idPontuacao"),
    @NamedQuery(name = "Pontuacao.findByPontos", query = "SELECT p FROM Pontuacao p WHERE p.pontos = :pontos")})
public class Pontuacao implements AbstractEntity {

    private static final long serialVersionUID = 4015303586229474633L;

    @Id
    @GeneratedValue(generator = "PON_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_PONTUACAO")
    private Long id;
    private int pontos;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario usuario;
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

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
}
