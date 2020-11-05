package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeira")
public class PrimeiraAplicacao {
	@GetMapping
	public String primeira () {
		return "Orientação ao Detalhe,Persistência e Orientação ao Futuro";
	}
}
