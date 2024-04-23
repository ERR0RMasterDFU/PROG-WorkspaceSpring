package com.salesianostriana.dam.ejemplobucle_switch;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Producto {

	private long id;
	private String name;
	private String description;
	private double price;
	private boolean inStock = false;
	
	//Importar Librería
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime date;
}
