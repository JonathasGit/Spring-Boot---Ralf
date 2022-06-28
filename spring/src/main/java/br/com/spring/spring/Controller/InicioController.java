package br.com.spring.spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Aqui serã o as criação das rotas

@RestController // REsponsável da rota 
public class InicioController {

    @GetMapping("")
    public String mensagem(){
        return "Hello World";
    }


    
}
