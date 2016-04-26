/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.services;

import br.uff.sti.model.dao.CalendarioDAO;
import br.uff.sti.model.domain.Calendario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author uff
 */
@Service
public class CalendarioServiceBean implements CalendarioService{
    @Autowired
    private CalendarioDAO calendarioDAO;
    
    @Override
    public Calendario salva(Calendario obj) {
        calendarioDAO.save(obj);
        return obj;
    }

    @Override
    public Calendario busca(String id) {
        return calendarioDAO.findOne(Long.parseLong(id));
    }

    @Override
    public List<Calendario> buscaPorAtributos(Calendario modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Calendario> todos() {
        return calendarioDAO.findAll();
    }
    
}
