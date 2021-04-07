package com.maira.comit.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maira.comit.dtos.PersonaDto;
import com.maira.comit.entidades.Categoria;
import com.maira.comit.repositorios.CategoriaRepository;
import com.maira.comit.repositorios.PersonaRepository;

@Controller
@RequestMapping("/")
public class CategoriaController {
	
	
	@Autowired
	PersonaRepository personaRepository;

	
	/*@RequestMapping("/categoria")
	public String Cat(Model model) {
		model.addAttribute("categorias", CategoriaRepository.buscaTodosPorIdyCategoria());
	}
	*/

}
