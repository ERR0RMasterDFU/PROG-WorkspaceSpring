package com.salesianostriana.dam.ejemplosformularios2.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Producto {

	private long id;
	private String name;
	private String description;
	private double price;
	private String tipo;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate FCaducidad;
	
}
