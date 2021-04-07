package com.maira.comit.repositorios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maira.comit.entidades.Publicacion;

@Repository
@Transactional
public interface PublicacionRepository extends CrudRepository<Publicacion, Long> {

	List<Publicacion> findAllByCategoria_Categoria(String categoria);

	@Query(value = "from Publicacion p join p.categoria c where c.categoria=:categoria")
	List<Publicacion> buscarPorCategoria(String categoria);
}
