package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/objetivos")
public class Objetivos {
	
	@GetMapping
	public String objetivos() {
		return "\t* * * Lista de Objetivos * * *\n\n"
				+ "- Exercícios matinais (meditação e corrida)\n"
				+ "- Reduzir em 15% o tempo de uso de redes sociais\n"
				+ "- Diminuir distrações\n"
				+ "- Assistir video aulas de Spring Boot\n"
				+ "- Reunião com grupo do Projeto Integrador\n"
				+ "- Me exercitar pelo menos 5 vezes durante a semana\n"
				+ "- DER do blog pessoal + planejar tema";
	}
}
