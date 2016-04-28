/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.sti.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author uff
 */
@Controller
@RequestMapping(value = "/evento")
public class EventoController {
    
    @RequestMapping(value = "medicina2016", method = RequestMethod.GET)
    String mediciana2016(Model model) {
       model.addAttribute("alunos", null);
       model.addAttribute("view", "fragments/exibeAlunosContent");
       return "index";
    }
}
