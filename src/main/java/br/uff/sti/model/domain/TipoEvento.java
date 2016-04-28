/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author uff
 */
@Entity
public class TipoEvento implements Serializable {
    public static final String INSCRICAO ="INS";
    
    
    @Id
    private String codigo;
    
    private String nome;
    
    private String descricao;
    
    public TipoEvento(){}
    
    public TipoEvento addNome(String nome){
        this.nome = nome;
        return this;
    }
    public TipoEvento addDescricao(String descricao){
        this.descricao = descricao;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
