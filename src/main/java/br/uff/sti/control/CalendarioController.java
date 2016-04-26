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
@RequestMapping(value = "/calendario")
public class CalendarioController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    String todos(Model model) {
       model.addAttribute("view", "fragments/exibeAlunosContent");
       return "index";
    }
}
