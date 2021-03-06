/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author uff
 */
@Entity
public class Evento implements Serializable {

    @Id
    @GeneratedValue
    private Long ID;

    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    
    private String grupo;
    
    @JoinColumn(name = "cod_calendar")
    @ManyToOne
    private Calendario calendario;
    
    @JoinColumn(name = "tipo")
    @ManyToOne
    private TipoEvento tipo;
    
    @ManyToOne
    @JoinColumn(name = "cod_curso")
    private Curso curso;
    
    public Evento(){}
    public Evento addGrupo(String grupo){
        this.grupo=grupo;
        return this;
    }
    public Evento addCalenadario(Calendario calendario){
        this.calendario = calendario;
        return this;
    }
    public Evento addTipo(TipoEvento tipo){
        this.tipo = tipo;
        return this;
    }
    public Evento addDataInicio(Date dataInicio){
        this.dataInicio = dataInicio;
        return this;
    }
    public Evento addDataFim(Date dataFim){
        this.dataFim = dataFim;
        return this;
    }
    public Evento addCurso(Curso curso){
        this.curso = curso;
        return this;
    }
    public Long getID() {
        return ID;
    }


    public Date getDataInicio() {
        return dataInicio;
    }


    public Date getDataFim() {
        return dataFim;
    }

    public String getGrupo() {
        return grupo;
    }


    public Calendario getCalendario() {
        return calendario;
    }

    public TipoEvento getTipo() {
        return tipo;
    }   

    public Curso getCurso() {
        return curso;
    }
    @Override
    public String toString() { 
        return "grupo: "+this.grupo + " inicio: "+this.dataInicio
                +" fim: "+this.dataFim + " tipo: "+this.tipo.getNome()
                + " curso: "+ this.curso.getNome() 
                +" referente ao calendarios: "+this.calendario.getAnoSemestre(); 
    }

}
