package com.maira.comit.repositorios;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maira.comit.entidades.Persona;
@Repository
@Transactional
public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
