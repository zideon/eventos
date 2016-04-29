/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.control;

import br.uff.sti.model.domain.Evento;
import br.uff.sti.model.services.ConsultasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author uff
 */
@RestController
@RequestMapping(value = "/evento")
public class EventoController {
    @Autowired
    ConsultasService consultas;
    
    @RequestMapping(value = "semana", method = RequestMethod.GET)
    List<Evento> mediciana2016() {
       return consultas.periodoInscricao2016SQL();
    }
}
