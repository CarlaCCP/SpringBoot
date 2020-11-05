package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//ponto no edereco do site
@RequestMapping ("/hello")
@RestController
public class ServicoController {
	// -->MVC --- model (tables)
		//M -->VC --- view (front)
		//MV -->C --- controller (cerebro,enderecamento)
		//JPA é interface
		
//		@GetMapping("/get1")
//		public String hello1 () {
//			return "Hey Get1 Hello World";
//		}
//		
//		@GetMapping("/get2")
//		public String hello2 () {
//			return "Hey Get2 Hello World";
//		}
//		
		//injeção ao repositorio
		@Autowired
		private ServicoRepository repository;
		
		// o find all pega todos os dados da tabela
		// get - pegar - findAll
		@GetMapping ("/servicos")
		public List<servico_model> pegarTodos() {		
			return repository.findAll();
		}
		//POST - inserir - save
		// serve para forçar o dado para entrar no banco de dados (requestBody)
		@PostMapping ("/servicos")
		public servico_model criar (@RequestBody servico_model tabelaServico) {
			repository.save(tabelaServico);
			return tabelaServico;
		}

}

