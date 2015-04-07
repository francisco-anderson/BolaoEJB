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
@SequenceGenerator(name = "USU_SEQ", sequenceName = "USUARIO_SEQ", allocationSize = 1, initialValue = 1)
public class Usuario implements AbstractEntity {

    private static final long serialVersionUID = 1799676888636233241L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USU_SEQ")
    @Column(name = "ID_USUARIO")
    private Long id;
    private String nome;
    private String email;
    private String senha;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
