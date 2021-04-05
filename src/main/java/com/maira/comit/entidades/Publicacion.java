package com.maira.comit.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Publicacion extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String fecha;
	private String texto;
	private String descripcion;
	/*@OneToMany
	private List<Archivo> archivos = new ArrayList<>();
	@ManyToOne
	private List<Categoria> categorias = new ArrayList<>();*/
	
}
