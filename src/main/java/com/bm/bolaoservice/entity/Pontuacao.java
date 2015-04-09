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
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Anderson
 */
@Entity
@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "PON_SEQ", sequenceName = "PONTUACAO_SEQ")
public class Pontuacao implements AbstractEntity {

    private static final long serialVersionUID = 4015303586229474633L;

    @Id
    @GeneratedValue(generator = "PON_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_PONTUACAO")
    private Long id;
    private int pontos;

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
}
