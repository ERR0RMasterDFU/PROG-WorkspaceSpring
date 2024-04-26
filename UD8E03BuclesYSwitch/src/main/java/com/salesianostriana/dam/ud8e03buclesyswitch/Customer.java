package com.salesianostriana.dam.ud8e03buclesyswitch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data @NoArgsConstructor @AllArgsConstructor
public class Customer {
	
	private long id; //LONG PARECE QUE SIRVE COMO UN NÚMERO AUTOINCREMENTADO
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String genero;

}
