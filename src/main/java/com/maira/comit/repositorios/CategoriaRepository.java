package com.maira.comit.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.maira.comit.entidades.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

	List<Categoria> findByCategoria(String categoria);
}
