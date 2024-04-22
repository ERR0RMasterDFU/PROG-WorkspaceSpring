package com.salesianostriana.dam.pe1thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorSaludo {
	
	@GetMapping({ "/", "welcome" }) //COPIA PEGA DE LA PÁGINA 12 (DOC UD8-THYMELEAF)
	public String welcome(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo") 
	String nombre, Model model) {
		model.addAttribute("nombre", nombre);
		//model.addAttribute("NOMBRE DE VARIABLE QUE VAMOS A USAR EN HTML", VALOR DE DICHA VARIABLE EN PROG);
		return "index";
	}
	
	@GetMapping("/saludo2")
	public String welcome2(Model model) {
		model.addAttribute("persona", new Persona("Ángel", "Naranjo González"));
		return "SaludoPersonalizado";
	}
	
	@GetMapping ("/saludo3")
	public String welcome3(Model model) {
		model.addAttribute("saludo", "Hola Mundo");
		model.addAttribute("mensaje", "¡Se me está haciendo largo el proyecto final!");
		model.addAttribute("url", "https://triana.salesianos.edu");
		return "SaludoYEnlace";
	}
	
}