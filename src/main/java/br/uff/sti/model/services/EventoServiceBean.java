/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.services;


import br.uff.sti.model.dao.EventoDAO;
import br.uff.sti.model.domain.Evento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author uff
 */
public class EventoServiceBean implements EventoService{
    
    @Autowired
    private EventoDAO eventoDAO;
    
    @Override
    public Evento salva(Evento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento busca(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> buscaPorAtributos(Evento modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento cria(Object... objs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Evento> todos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
