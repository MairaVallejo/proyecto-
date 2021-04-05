package com.maira.comit.entidades;

import java.io.Serializable;
import java.util.ArrayList;
//import java.util.List;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity
//@Getter
//@Setter

public class Administrador extends Usuario implements Serializable {
	public static final long serialVersionUID = 1l;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	private String nombreLocal; 
	private String nombreEmpresa;
	private String ubicacion;
	private String contactos;
	private String horarios;
	private String categoria; 
	//@OneToMany(mappedBy = "Administrador")
	//private List<Categoria> categorias;
	
	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nombreLocal, String nombreEmpresa,String ubicacion, String contactos, String horarios, String categoria) {
		this.nombreLocal = nombreLocal;
		this.nombreEmpresa = nombreEmpresa;
		this.ubicacion = ubicacion;
		this.contactos = contactos;
		this.horarios = horarios;
		this.categoria = categoria;
	}
	
	
	
	
	
	
	


	public static void setnombreLocal(String nombreLocal) {
		// TODO Auto-generated method stub
		
	}


	public static void setnombreEmpresa(String nombreEmpresa) {
		// TODO Auto-generated method stub
		
	}



}
