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
import org.springframework.stereotype.Service;

/**
 *
 * @author uff
 */
@Service
public class ConsultasService {
    @Autowired
    private EventoDAO eventoDAO;
    
    public List<Evento> eventosMedicina2016(){
        return eventoDAO.findEventosMedicina2016();
    }
    public List<Evento> eventos2016(){
        return eventoDAO.findEventos2016();
    }
    public List<Evento> periodoInscricao2016(){
        return eventoDAO.findInscricao2016();
    }
    public List<Evento> periodoInscricao2016SQL(){
        return eventoDAO.findInscricao2016SQL();
    }
    public List<Evento> eventosParalelosSemanaAcademica(){
        return eventoDAO.findEventosParalelosSemanaAcademica();
    }
}
