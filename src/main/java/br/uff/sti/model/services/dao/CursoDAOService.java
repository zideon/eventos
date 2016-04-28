/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.services.dao;

import br.uff.sti.model.dao.CursoDAO;
import br.uff.sti.model.domain.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author uff
 */
@Service
public class CursoDAOService implements DAOService<Curso>{

    @Autowired
    private CursoDAO cursoDAO;
    
    @Override
    public Curso salva(Curso obj) {
        cursoDAO.save(obj);
        return obj;
    }

    @Override
    public Curso busca(String id) {
         return cursoDAO.findOne(id);
    }

    @Override
    public List<Curso> buscaPorAtributos(Curso modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Curso> todos() {
        return cursoDAO.findAll();
    }
    
}
