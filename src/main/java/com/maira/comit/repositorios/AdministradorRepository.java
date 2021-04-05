package com.maira.comit.repositorios;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maira.comit.entidades.Administrador;
@Repository
@Transactional
public interface AdministradorRepository extends CrudRepository<Administrador, Long> {

}
