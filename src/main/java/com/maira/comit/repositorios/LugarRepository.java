package com.maira.comit.repositorios;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.maira.comit.entidades.Lugar;


@Repository
@Transactional
public interface LugarRepository extends CrudRepository<Lugar, Long> {
	List<Lugar> findAllByCategoria_Categoria(String categoria);

	@Query(value = "from Lugar p join p.categoria c where c.categoria=:categoria")
	List<Lugar> buscarPorCategoria(String categoria);

}
