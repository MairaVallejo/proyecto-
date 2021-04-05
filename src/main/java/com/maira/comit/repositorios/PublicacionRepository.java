package com.maira.comit.repositorios;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maira.comit.entidades.Publicacion;
@Repository
@Transactional
public interface PublicacionRepository extends CrudRepository<Publicacion, Long> {

}
