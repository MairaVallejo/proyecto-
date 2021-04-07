package com.maira.comit.dtos;

import java.io.Serializable;

public class AdministradorDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nombreLocal; 
	private String nombreEmpresa;
	private String ubicacion;
	private String contactos;
	private String horarios;
	private String categoria;
	private Boolean activo = true;
	
	
	public AdministradorDto() {
		// TODO Auto-generated constructor stub
	}

	public AdministradorDto(String nombreLocal, String nombreEmpresa,String ubicacion, String contactos, String horarios, String categoria) {
		this.nombreLocal = nombreLocal;
		this.nombreEmpresa = nombreEmpresa;
		this.ubicacion = ubicacion;
		this.contactos = contactos;
		this.horarios = horarios;
		this.categoria = categoria;
	}

	public String getNombreLocal() {
		return nombreLocal;
	}

	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getContactos() {
		return contactos;
	}

	public void setContactos(String contactos) {
		this.contactos = contactos;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
