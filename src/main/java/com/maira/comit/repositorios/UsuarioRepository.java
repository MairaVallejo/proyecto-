package com.maira.comit.repositorios;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maira.comit.entidades.Usuario;
@Repository
@Transactional
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
