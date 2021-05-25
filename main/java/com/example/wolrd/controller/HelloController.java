package com.example.wolrd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Annotattion que indica que é uma classe controladora
public class HelloController {
	
	@GetMapping("/world")
	public String sayHello(){
		
		return "Hello World"
				+"\nAs habilidades utilizadas por mim foram orientação ao detalhe e persistência"
				+"\nDurante a semana eu quero desenvolver as minhas habilidades técnicas em SpringBoot e Banco de dados Mysql";
	
	}
	
	
	

}
