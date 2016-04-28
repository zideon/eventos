/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.services.dao;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author uff
 */
@Service
public interface DAOService<I> {
 
    public I salva(I obj);
    public I busca(String id);
    public List<I> buscaPorAtributos(I modelo);
    public Iterable<I> todos();
}
