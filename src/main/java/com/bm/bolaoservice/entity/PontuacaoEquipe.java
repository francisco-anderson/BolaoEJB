/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bm.bolaoservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Anderson
 */
@Table(name = "PONTUACAO_EQUIPE")
@Entity
@SequenceGenerator(allocationSize = 1, initialValue = 1, name = "PONT_EQUIP", sequenceName = "PONTUACAO_EQUIPE_SEQ")
public class PontuacaoEquipe implements AbstractEntity {

    private static final long serialVersionUID = -7067194567840944632L;
    
    @Id
    @GeneratedValue(generator = "PONT_EQUIP",strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
    private Integer golspros;
    private Integer golscontra;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Integer getGolspros() {
        return golspros;
    }

    public void setGolspros(Integer golspros) {
        this.golspros = golspros;
    }

    public Integer getGolscontra() {
        return golscontra;
    }

    public void setGolscontra(Integer golscontra) {
        this.golscontra = golscontra;
    }
    

}
