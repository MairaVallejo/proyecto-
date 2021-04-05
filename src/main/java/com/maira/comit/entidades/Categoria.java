package com.maira.comit.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



//@Entity
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String categoria;
	
	
	
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
// que elija la categoria 
