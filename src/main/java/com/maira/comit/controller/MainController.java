package com.maira.comit.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.maira.comit.database.SingletonDatabase;
import com.maira.comit.dtos.PersonaDto;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	SingletonDatabase singletonDatabase;

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/alta")
	public String alta(Model model) {
		PersonaDto persona = new PersonaDto();
		persona.setFechaNacimiento(new Date());
		model.addAttribute("persona", persona);

		return "alta";
	}

	@RequestMapping("/listado")
	public String list(Model model) {
		model.addAttribute("personas", singletonDatabase.findAllActive());
		return "listado";
	}

	@RequestMapping("/borrados")
	public String deleted(Model model) {
		model.addAttribute("personas", singletonDatabase.findAllNonActive());
		return "listado";
	}

	@RequestMapping(value = "/personas", method = { RequestMethod.POST, RequestMethod.PUT })
	public String edit(@RequestParam(value = "id") int id, Model model) {
		PersonaDto persona = singletonDatabase.findById(id);
		model.addAttribute("persona", persona);
		return "editar";
	}

	@RequestMapping(value = "/save", method = { RequestMethod.POST, RequestMethod.PUT })
	public String save(@RequestParam(value = "nombre") String nombre, @RequestParam(value = "apellido") String apellido,
			@RequestParam(value = "fechaNacimiento") String fechaNacimiento,
			Model model) throws ParseException {

		Date fecha = new SimpleDateFormat("yyyy-mm-dd").parse(fechaNacimiento);

		PersonaDto persona = new PersonaDto(apellido, nombre, fecha);
		persona.setId(singletonDatabase.count());
		singletonDatabase.save(persona);
		model.addAttribute("persona", persona);
		return "redirect:/listado";
	}

	@RequestMapping(value = "/edit/{id}", method = { RequestMethod.POST, RequestMethod.PUT })
	public String edit(@PathVariable(value = "id") Integer id, @RequestParam(value = "nombre") String nombre,
			@RequestParam(value = "apellido") String apellido,
			@RequestParam(value = "fechaNacimiento") String fechaNacimiento,
			@RequestParam(value = "activo", required = false) Boolean activo, Model model) throws ParseException {

		Date fecha = new SimpleDateFormat("yyyy-mm-dd").parse(fechaNacimiento);

		PersonaDto persona = singletonDatabase.findById(id);
		persona.setApellido(apellido);
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fecha);
//		persona.setActivo(activo != null);
		persona.setActivo(activo == null ? false : true);

		return "redirect:/listado";
	}

	@PostMapping(value = "/conf-borrar")
	public String borrar(@RequestParam(value = "id") int id, Model model) {
		PersonaDto persona = singletonDatabase.findById(id);
		model.addAttribute("persona", persona);
		return "confirmarBorrado";
	}

	@PostMapping(value = "/borrar/{id}")
	public String personaBorrada(@PathVariable(value = "id") int id, Model model) {
		try {
			singletonDatabase.delete(id);
		} catch (Exception e) {
			model.addAttribute("error", "No se pudo eliminar el registro");
			return "error";
		}
		return "personaBorrada";
	}

	@GetMapping(value = "/error")
	public String error() {
		return "error";
	}
	
	
}
