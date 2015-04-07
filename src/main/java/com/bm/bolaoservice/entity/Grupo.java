/*
 * To change this template, choose Tools | Templates
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
 * @author 220460
 */
@Entity
@SequenceGenerator(allocationSize= 1, initialValue=1, name="GRU_SEQ",sequenceName="GRUPO_SEQ")
public class Grupo implements AbstractEntity{
    
    @Id
    @GeneratedValue(generator="GRU_SEQ",strategy= GenerationType.SEQUENCE)
    @Column(name="ID_GRUPO")
    private Long id;
    private String nome;
    //CHICAO BOBAO
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
    
}
