package br.com.spring.spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Aqui serã o as criação das rotas

@RestController // REsponsável da rota 
public class InicioController {

    @GetMapping("")
    public String mensagem(){
        return "Hello World";
    }
    @GetMapping("/bemvindo")
    public String bemVindo(){
        return "Seja bem vindo(a)";
    }
    @GetMapping("/bemvindo/{nome}")
    public String bemVindo2(@PathVariable String nome){
        return "Seja bem vindo(a) " + nome + " a nossa Api do curso de Spring Boot";
    }


    
}
