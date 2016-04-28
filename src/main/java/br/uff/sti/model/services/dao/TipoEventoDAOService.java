/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.services.dao;

import br.uff.sti.model.dao.TipoEventoDAO;
import br.uff.sti.model.domain.TipoEvento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author uff
 */
@Service
public class TipoEventoDAOService implements DAOService<TipoEvento>{

    @Autowired
    private TipoEventoDAO tipoEventoDAO;
    @Override
    public TipoEvento salva(TipoEvento obj) {
        tipoEventoDAO.save(obj);
        return obj;
    }

    @Override
    public TipoEvento busca(String id) {
       return  tipoEventoDAO.findOne(Long.parseLong(id));
    }

    @Override
    public List<TipoEvento> buscaPorAtributos(TipoEvento modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<TipoEvento> todos() {
        return tipoEventoDAO.findAll();
    }
    
}
