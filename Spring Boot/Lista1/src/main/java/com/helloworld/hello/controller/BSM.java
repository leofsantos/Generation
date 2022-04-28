package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSM {
	
	@GetMapping
	public String ListaBsm() {
		return "\t* * * LISTA DE BSM's GENERATION BRASIL * * *\n"
				+ "\n\t MENTALIDADES:\n- Orientação ao detalhe\n- Responsabilidade pessoal\n- Mentalidade de crescimento"
				+ "\n- Persistência\n"
				+ "\n\tHABILIDADES:\n- Trabalho em equipe\n- Atenção aos detalhes\n- Proatividade\n- Comunicação";
	}
}
