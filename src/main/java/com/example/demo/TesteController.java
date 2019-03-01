package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/novo")
public class TesteController {
	
	@Autowired
	private TesteRepository repository;
	
	@GetMapping(name = "/")
	public void teste() {
		Teste teste = new Teste();
		teste.setNome("Teste 1");
		repository.save(teste);
	}

}
