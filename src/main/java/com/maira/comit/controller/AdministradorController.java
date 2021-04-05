package com.maira.comit.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maira.comit.entidades.Administrador;
import com.maira.comit.repositorios.AdministradorRepository;



@RestController
@RequestMapping("api/Usuario")
public class AdministradorController {
	
	@Autowired
    AdministradorRepository repo; // 

	/*@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Administrador>> getAdministrador(){
		return new ResponseEntity<List<Administrador>>(List<Administrador>) repo.findAll(), HttpStatus.OK);
	}*/
	
	@PostMapping(value = "/")
	public ResponseEntity<Wrapper> saveAdministrador(@PathParam(value = "noombreLocal") String nombreLocal){
		Wrapper wrapper = new Wrapper();
		Administrador administrador = new Administrador();
		
		administrador.setnombreLocal(nombreLocal);
		//administrador.getnombreEmpresa(nombreEmpresa);
		//administrador.setcategoria(categoria);
		
		
		repo.save(administrador);
		wrapper.object = administrador;
		wrapper.status = "El cliente fue agregado";
		return new ResponseEntity<Wrapper>(wrapper, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Wrapper> deleteAdministrador(@PathParam(value = "id") Long id){
		Wrapper wrapper = new Wrapper();
		
		try {
			Administrador administrador = repo.findById(id).get();
			repo.delete(administrador);
			wrapper.status ="El cliente "+ id + "fue eliminado";
		}	catch (Exception e) {
			wrapper.status = "El cliente no fue encontrado";
		}
		return new ResponseEntity<Wrapper>(wrapper, HttpStatus.OK);
		
	}	
	public class Wrapper{
		public String status;
		public Object object;
	}
		
}
