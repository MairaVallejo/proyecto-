package com.maira.comit;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.maira.comit.entidades.Administrador;
import com.maira.comit.repositorios.AdministradorRepository;


@SpringBootApplication
public class ProyectoMairaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoMairaApplication.class, args);
	}
	@Bean 
	public CommandLineRunner loadData(AdministradorRepository repository) {
	return (args) -> {
		String[] nombreLocal = {"locaR","localC","localC"};
		String[] nombreEmpresa = {"nombre1","nombre2","nombre3"};		
		Administrador administrador = new Administrador();
		Administrador.setnombreLocal("minoombrelocal");
		Administrador.setnombreEmpresa("Esta empresa");
		repository.save(administrador);
	};}
	
}
