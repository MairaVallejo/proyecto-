package com.maira.comit.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
@Entity
public class Archivo extends Publicacion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id; 
	private String descripcion; 
	//@Type( type = "Text") //me permite escribir mas cosas 
	
	
	
	public Archivo() {
		// TODO Auto-generated constructor stub
	}
}
	
