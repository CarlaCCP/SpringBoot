package com.projeto.minhaLojaDeGames;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;



@Entity
@Table(name= "tb_jogos")
public class Jogos {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column
	private String nome;
	
	@NotNull
	@Column
	private String tipoConsole;
	
	@NotNull
	@Column
	private double preco;
	
	@ManyToOne
	@JsonIgnoreProperties("jogos")
	private Categoria categoria;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoConsole() {
		return tipoConsole;
	}

	public void setTipoConsole(String tipoConsole) {
		this.tipoConsole = tipoConsole;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
}
