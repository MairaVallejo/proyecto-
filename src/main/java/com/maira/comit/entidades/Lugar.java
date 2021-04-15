package com.maira.comit.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;



@Data
@Entity

public class Lugar extends Usuario implements Serializable {
	public static final long serialVersionUID = 1l;
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	private String nombreLugar; 
	private String ubicacion;
	private Integer contactos;
	private String horarios;
	@ManyToOne
	private Categoria categoria;
	//private String categoria; 
	private Foto foto; 
	
	public Lugar() {
		// TODO Auto-generated constructor stub
	}

	public Lugar(String nombreLugar,String ubicacion, Integer contactos, String horarios, Categoria categoria) {
		this.nombreLugar = nombreLugar;
		this.ubicacion = ubicacion;
		this.contactos = contactos;
		this.horarios = horarios;
		this.categoria = categoria;
	}
	public String getNombreLugar() {
		return nombreLugar;
	}

	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public Integer getContactos() {
		return contactos;
	}

	public void setContactos(Integer contactos) {
		this.contactos = contactos;
	}
	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
