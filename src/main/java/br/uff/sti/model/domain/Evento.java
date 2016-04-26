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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
    
    @ManyToOne
    private Calendario calendario;
    
    @ManyToOne
    private TipoEvento tipo;
    
    public Evento(){}
    public Evento addGrupo(String grupo){
        this.grupo=grupo;
        return this;
    }
    public Evento addCalenadario(Calendario calendario){
        this.calendario = calendario;
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
    
}
