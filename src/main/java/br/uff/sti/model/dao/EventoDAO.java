/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.dao;

import br.uff.sti.model.domain.Evento;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author uff
 */
public interface EventoDAO extends CrudRepository<Evento,Long>{
    @Query("SELECT ev FROM Evento ev "
            + " INNER JOIN FETCH atu.aluno al "
            + " INNER JOIN FETCH atu.turma t "
            + " WHERE t.codigo = ?1")
    public  List<Evento> findByCodigoDoCurso(String codigo);
}
