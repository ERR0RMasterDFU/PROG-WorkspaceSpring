package com.salesianostriana.dam.ejemplobucle_switch;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductoService {

	public List<Producto> getLista(){
		return Arrays.asList(
				new Producto (1, "Botijo", "Enfría hasta menos 10 grados", 20.6505, true, LocalDateTime.now()),
				new Producto (2, "BotijoEXTRA", "Enfría hasta menos 200 grados", 150.7891, true, LocalDateTime.now())
				);
	}
}
