package com.maira.comit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maira.comit.entidades.Usuario;
import com.maira.comit.repositorios.UsuarioRepository;
@RestController
@RequestMapping("api/Usuario")
public class UsuarioController {
/*@Autowired
	private UsuarioRepository usuarioRepo;
	@GetMapping(value ="/")
	public ResponseEntity<Usuario> nuevoUsuario(){
		
		
		Usuario usuario = new Usuario();
		usuarioRepo.save(usuario);
		return ResponseEntity.ok(usuario);
	}*/
}