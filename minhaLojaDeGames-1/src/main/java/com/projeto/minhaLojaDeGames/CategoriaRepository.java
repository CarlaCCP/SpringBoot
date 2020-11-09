package com.projeto.minhaLojaDeGames;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);
}
