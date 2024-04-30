package com.salesianostriana.dam.ejemplosformularios2.service;

import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {

	public String [] getTipos() {
		String[] tipos = new String[] {"Lagar", "Pilson", "Guiness", "Sin filter"};
		
		return tipos;
	}
} 
