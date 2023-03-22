package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica ao spring que essaé uma classe controladora
@RestController


//indica um endpoint para nossa aplicação.
@RequestMapping ("/hello")
public class HelloController {

	@GetMapping("/hello")
	public String batata() {
		return "Alô mundaum!";
		
	}
	 @GetMapping ("/bsms") 
	 public String bsms() {
	     return "- Persistência \n" +
	            "- Mentalidade de Crescimento \n" +
	    		"- Orientação ao Futuro \n" +  
	            "- Responsabilidade Pessoal \n" +
	    		"- Trabalho em Equipe \n" +
	            "- Comunicação \n" +
	    		"- Comunicação Não Violenta \n" +
	            "- Atenção para Detalhes \n" +
	    		"- Proatividade";
    }

     @GetMapping ("/objetivos")	    
     
     public String objetivos() { 
    	 return "Aprender a usar Spring Boot \n" +
                "Começar o projeto do meu blog pessoal \n"+
    			"Começar a trabalhar no projeto integrador \n" + 
                "Estudar mais sobre computação quantica e outras novas tecnologias";
	    
		    }
	
}

