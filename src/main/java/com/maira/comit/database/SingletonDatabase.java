package com.maira.comit.database;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.maira.comit.dtos.PersonaDto;

@Component
@Scope("singleton")
public class SingletonDatabase {
	List<PersonaDto> personas = new ArrayList<>();
	
	public void save(PersonaDto p) {
		personas.add(p);
	}
	
	public void delete(int ix) {
		personas.remove(ix);
	}
	public List<PersonaDto> findAll() {
		return personas;
	}

	public int count() {
		return personas.size();
	}
	public PersonaDto findById(int ix) {
		try {
			return personas.get(ix);
		} catch (Exception e) {
			throw new RuntimeException("No existe la persona con id "+ix);
		}
	}

	public List<PersonaDto> findAllNonActive() {
		return personas.stream().filter(p -> !p.getActivo()).collect(Collectors.toList());
	}

	public List<PersonaDto> findAllActive() {
		return personas.stream().filter(p -> p.getActivo()).collect(Collectors.toList());
	}
}
