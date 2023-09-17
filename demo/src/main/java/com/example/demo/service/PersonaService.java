package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPersona;

@Service
public class PersonaService implements IPersonaService{

	@Autowired
	private IPersona persona;
	
	@Override
	public void registrar(String nombre) {

		persona.registrar(nombre);
	}

}
