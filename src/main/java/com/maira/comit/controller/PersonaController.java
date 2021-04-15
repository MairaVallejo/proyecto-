package com.maira.comit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.maira.comit.entidades.Persona;
import com.maira.comit.repositorios.PersonaRepository;

@Controller
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	PersonaRepository personaRepository;
	
	//crea una persona
	@RequestMapping("/alta")
	public String alta(Model model) {
		Persona persona = new Persona();
		persona.setUbicacion(new String());
		
		persona.setUsername(new String());
		persona.setPassword(new String());
		persona.setEmail(new String());
		model.addAttribute("persona", persona);

		return "alta";
	}
	//guarda datos del usuario
	@RequestMapping(value = "/save", method = { RequestMethod.POST, RequestMethod.PUT })
	public String save(@RequestParam(value = "username") String username, @RequestParam(value = "email") String email,
			@RequestParam(value = "password") String password, @RequestParam(value = "ubicacion") String ubicacion,
			Model model) {

		Persona persona = new Persona();
		persona.setEmail(email);
		persona.setUbicacion(ubicacion);
		persona.setUsername(username);
		persona.setPassword(password);
		personaRepository.save(persona);

		model.addAttribute("persona", personaRepository.findAll());
		return "redirect:/listado"; //quiero que me lleve a la lista desordenada de lugares
	}


//		@PostMapping(value = "/borrar/{id}")
//		public String personaBorrada(@PathVariable(value = "id") int id, Model model) {
//			try {
//				PersonaRepository.deleteById(id);
//			} catch (Exception e) {
//				model.addAttribute("error", "No se pudo eliminar el registro");
//				return "error";
//			}
//			return "personaBorrada";
//		}

	@GetMapping(value = "/error")
	public String error() {
		return "error";

	}
}
