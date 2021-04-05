package com.maira.comit.repositorios;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maira.comit.entidades.Archivo;
@Repository
@Transactional
public interface ArchivoRepository extends CrudRepository<Archivo, Long> {
	
}
