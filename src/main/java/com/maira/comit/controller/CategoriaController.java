package com.maira.comit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maira.comit.repositorios.CategoriaRepository;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	CategoriaRepository categoriaRepository;

	@RequestMapping("/categoria")
	public String listar(Model model) {
		model.addAttribute("categorias", categoriaRepository.findAll());
		return "categorias";
	}

}
