/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author uff
 */
@Entity
public class Calendario implements Serializable {

    @Id
    private String anoSemestre;

    public Calendario(){}
    
    public Calendario addAnoSemestre(String anoSemestre){
        this.anoSemestre = anoSemestre;
        return this;
    }

    public String getAnoSemestre() {
        return anoSemestre;
    }
        
}
