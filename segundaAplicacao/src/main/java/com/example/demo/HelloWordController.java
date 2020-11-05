package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class HelloWordController {
	@GetMapping
	public String hallo () {
		return "Meus objetivos são:\n1.Estudar Spring;\n2.Estudar MySQL;\n3.Estudar MER e DER.";
	}
}
