package com.maira.comit.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maira.comit.entidades.Categoria;

@Controller
@RequestMapping("/Categoria")
public class CategoriaController {
	
	static List<Categoria> lista = new ArrayList<Categoria>();
	  static {
	    
	    lista.add(new Categoria (1l, "Bibliotecas"));
	  
	    lista.add(new Categoria (2l,"Gastronomia"));
	    
	    lista.add(new Categoria (3l,"Farmacias"));
	    
	    
	  }
	  @RequestMapping("/Catgoria")
	  public List<Categoria>  buscarTodos() {
	    
	    return lista;
	  }
	  
	  @RequestMapping(value ="/Categoria" , params={"id","categoria"} )
	  public List<Categoria>  buscarTodosPorIdyCategoria(@RequestParam String categoria ,@RequestParam Long id ) {
	    
	    Predicate<Categoria> filtro= (p)->((Categoria) p).getId().equals(id);
	    filtro.and((p->p.getCategoria().equals(categoria)));
	    
	    return lista.stream().filter(filtro).collect(Collectors.toList());
	  }
	

}
