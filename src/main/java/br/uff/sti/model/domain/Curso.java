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
public class Curso implements Serializable {

    @Id
    @GeneratedValue
    private String codigo;

    private String nome;

    public Curso(){}
    public Curso addCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }
    public Curso addNome(String nome){
        this.nome = nome;
        return this;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
}
