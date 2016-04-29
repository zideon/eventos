/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.model.dao;

import br.uff.sti.model.domain.Curso;
import br.uff.sti.model.domain.Evento;
import br.uff.sti.model.domain.TipoEvento;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author uff
 */
public interface EventoDAO extends CrudRepository<Evento, Long> {
  
    //todos os eventos de 2016
    @Query("SELECT ev FROM Evento ev "
            + " INNER JOIN ev.calendario cal "
            + " INNER JOIN ev.curso cur"
            + " INNER JOIN ev.tipo te"
            + " WHERE cal.anoSemestre = '2016/01' OR cal.anoSemestre = '2016/02'")
    public List<Evento> findEventos2016();

    
    //medicina 2016
    @Query("SELECT ev FROM Evento ev "
            + " INNER JOIN ev.calendario cal "
            + " INNER JOIN ev.curso cur"
            + " INNER JOIN ev.tipo te"
            + " WHERE cur.codigo = '"+Curso.MEDICINA+"' AND (cal.anoSemestre = '2016/01' OR cal.anoSemestre = '2016/02')")
    public List<Evento> findEventosMedicina2016();

    //periodo de inscricao com curso, utiliza os nomes das classes e deus atributos
    @Query("SELECT ev FROM Evento ev "
            + " INNER JOIN ev.calendario cal "
            + " INNER JOIN ev.curso cur"
            + " INNER JOIN ev.tipo te"
            + " WHERE te.codigo = '"+TipoEvento.INSCRICAO + "' AND ( cal.anoSemestre = '2016/01' OR cal.anoSemestre = '2016/02' )")
    public List<Evento> findInscricao2016();
    
    //periodo de inscricao com curso sql, verifique os nomes das tabelas no banco
    @Query(nativeQuery = true,value = "SELECT * FROM evento ev "
            + " INNER JOIN calendario cal "
            + " INNER JOIN curso cur"
            + " INNER JOIN tipo_evento te"
            + " WHERE te.codigo = '"+TipoEvento.INSCRICAO + "' AND ( cal.ano_semestre = '2016/01' OR cal.ano_semestre = '2016/02' )")
    public List<Evento> findInscricao2016SQL();
    
     @Query("SELECT ev FROM Evento ev "
            + " INNER JOIN ev.calendario cal "
            + " INNER JOIN ev.curso cur"
            + " INNER JOIN ev.tipo te"
            + " WHERE ( ev.dataInicio between '2016-10-1' and '2016-10-5' )"
             + " AND ev.dataFim between '2016-10-1' and '2016-10-5' ")
    public List<Evento> findEventosParalelosSemanaAcademica();
}
