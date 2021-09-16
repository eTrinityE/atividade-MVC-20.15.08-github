package br.edu.iftm.atividade4teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controlador {

    @RequestMapping("/")
    String inicio(){
        return "home";
    }
    @RequestMapping("/pg2")
    String fim(){
        return "home2";
    }
    
}