package com.maira.comit.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Persona extends Usuario implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	private Long id; 
	private String ubicacion;
	
	
	public Persona(String ubicacion) { 
		this.ubicacion = ubicacion; 
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
	
	
	
	
}
