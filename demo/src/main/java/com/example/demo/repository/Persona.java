package com.example.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.DemoApplication;

@Repository
public class Persona implements IPersona {

	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro a: " + nombre);

	}

}
