package com.maira.comit.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
public class Foto extends Publicacion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	@Column(nullable = true ,length = 64)
	private String foto; 
	//@Type( type = "Text") 
	
	
	
	public Foto() {
		// TODO Auto-generated constructor stub
	}
}
	
