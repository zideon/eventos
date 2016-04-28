/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.services;

import br.uff.sti.model.dao.EventoDAO;
import br.uff.sti.model.domain.Curso;
import br.uff.sti.model.domain.Evento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author uff
 */
public class ConsultasService {
    @Autowired
    private EventoDAO eventoDAO;
    
    public List<Evento> eventosMedicina2016(){
        return eventoDAO.findByMedicina2016();
    }
    public List<Evento> eventos2016(){
        return eventoDAO.findByCalendar2016();
    }
    public List<Evento> periodoInscricao2016(){
        return eventoDAO.findByInscricao2016();
    }
}
