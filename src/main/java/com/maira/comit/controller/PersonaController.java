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

	@RequestMapping("/alta")
	public String alta(Model model) {
		Persona persona = new Persona();
//			persona.setFechaNacimiento(new Date());
		model.addAttribute("persona", persona);

		return "alta";
	}

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
		return "redirect:/listado";
	}

//		@RequestMapping("/listado")
//		public String list(Model model) {
//			model.addAttribute("personas", personaRepository.findAll());
//			return "listado";// en el atributo "personas" agrega todas las personas activas
//		}
//
//		@RequestMapping("/borrados")
//		public String deleted(Model model) {
//			model.addAttribute("personas", personaRepository.findAll());
//			return "listado";
//		}
//		// en el atributo "categorias" agregar todos los locales con esa categoria
//
//		@RequestMapping(value = "/personas", method = { RequestMethod.POST, RequestMethod.PUT })
//		public String edit(@RequestParam(value = "id") Long id, Model model) {
//			Persona persona = personaRepository.findById(id).get();
//			model.addAttribute("persona", persona);
//			return "editar";
//		}
//
//		@RequestMapping(value = "/save", method = { RequestMethod.POST, RequestMethod.PUT })
//		public String save(@RequestParam(value = "nombre") String nombre,
//				@RequestParam(value = "apellido") String apellido,
//				@RequestParam(value = "fechaNacimiento") String fechaNacimiento, Model model) throws ParseException {
//
//			Date fecha = new SimpleDateFormat("yyyy-mm-dd").parse(fechaNacimiento);
//
//			Persona persona = new Persona();
//			model.addAttribute("persona", persona);
//			return "redirect:/listado";
//		}
//
//		@RequestMapping(value = "/edit/{id}", method = { RequestMethod.POST, RequestMethod.PUT })
//		public String edit(@PathVariable(value = "id") Long id, @RequestParam(value = "nombre") String nombre,
//				@RequestParam(value = "apellido") String apellido,
//				@RequestParam(value = "fechaNacimiento") String fechaNacimiento,
//				@RequestParam(value = "activo", required = false) Boolean activo, Model model) throws ParseException {
//
//			Date fecha = new SimpleDateFormat("yyyy-mm-dd").parse(fechaNacimiento);
//
//			Persona persona = personaRepository.findById(id).get;
//			persona.setApellido(apellido);
//			persona.setNombre(nombre);
//			persona.setFechaNacimiento(fecha);
////			persona.setActivo(activo != null);
//			persona.setActivo(activo == null ? false : true);
//
//			return "redirect:/listado";
//		}
//
//		@PostMapping(value = "/conf-borrar")
//		public String borrar(@RequestParam(value = "id") int id, Model model) {
//			Persona persona = PersonaRepository.findById(id);
//			model.addAttribute("persona", persona);
//			return "confirmarBorrado";
//		}
//
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
