package com.maira.comit.repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maira.comit.entidades.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
		
		/*static List<Categoria> categorias = new ArrayList<>();
		  static {
		    
		    categorias.add(new Categoria (1l, "Bibliotecas"));
		  
		    categorias.add(new Categoria (2l,"Restaurantes"));
		    
		    categorias.add(new Categoria (3l,"Farmacias"));
		    
		    
		  }
		  public void save(Categoria p) {
				categorias.add(p);
			}
		  
		  @RequestMapping("/Categoria")
		  public List<Categoria>  buscarTodos() {
		    
		    return categorias;
		  }
		  
		  public int count() {
				return categorias.size();
			}
		  
		  @RequestMapping(value ="/Categoria" , params={"id","categoria"} )
		  public List<Categoria>  buscarTodosPorIdyCategoria(@RequestParam String categoria ,@RequestParam Long id ) {
		    
		    Predicate<Categoria> filtro= (p)->((Categoria) p).getId().equals(id);
		    filtro.and((p->p.getCategoria().equals(categoria)));
		    
		    return categorias.stream().filter(filtro).collect(Collectors.toList());
		  }
*/
}
