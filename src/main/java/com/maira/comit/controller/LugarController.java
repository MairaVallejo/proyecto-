package com.maira.comit.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.maira.comit.entidades.Lugar;
import com.maira.comit.repositorios.LugarRepository;



@Controller
@RequestMapping("/lugar")
public class LugarController {
	
	@Autowired
    LugarRepository lugarRepository; // 
	
	@RequestMapping("/sitio")
	public String sitio(Model model) {
		Lugar lugar = new Lugar();
		lugar.setNombreLugar(new String());
		//lugar.setCategoria(new String());
		lugar.setUbicacion(new String());
		lugar.setHorarios(new String());
		//lugar.setContactos(new Integer(0));
		model.addAttribute("lugar", lugar);

		return "sitio";
	}
	//guarda datos del lugar
	@RequestMapping(value = "/sitio", method = { RequestMethod.POST, RequestMethod.PUT })
	public String save(@RequestParam(value = "nombreLugar") String nombreLugar,
			@RequestParam(value = "ubicacion") String ubicacion, 
			@RequestParam(value = "contactos") Integer contactos,
			@RequestParam(value = "horarios") String horarios,
			@RequestParam(value = "categoria") String categoria,
			Model model) {

		Lugar lugar = new Lugar();
		lugar.setNombreLugar(nombreLugar);
		lugar.setHorarios(horarios);
		lugar.setUsername(ubicacion);
		lugar.setContactos(contactos);
		lugarRepository.save(lugar);

		model.addAttribute("lugar", lugarRepository.findAll());
		return "redirect:/perfil";
	}
		//devuelve el listado de lugares
		@RequestMapping("/listado")
		public String list(Model model) {
			model.addAttribute("lugar", lugarRepository.findAll());
			return "listado";// en el atributo "lugar" agrega todos los lugares
		}


	@GetMapping(value = "/error")
	public String error() {
		return "error";

	}
	
}
