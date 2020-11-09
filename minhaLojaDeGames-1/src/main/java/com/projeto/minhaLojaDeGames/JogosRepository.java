package com.projeto.minhaLojaDeGames;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface JogosRepository extends JpaRepository<Jogos, Long> {

	public List<Jogos> findAllByNomeContainingIgnoreCase(String nome);

}
