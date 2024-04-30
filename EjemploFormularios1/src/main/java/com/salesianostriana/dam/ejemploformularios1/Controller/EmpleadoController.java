package com.salesianostriana.dam.ejemploformularios1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.ejemploformularios1.modelo.Empleado;

@Controller
public class EmpleadoController {

	@GetMapping ("/empleado")
	public String showForm(Model model) {
		
		//El empleado se instancia vacío porque es el que se usa para pintar 
		//el formulario que estamos creando sin datos.
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado); 
		
		//De momento está vacío, pero se rellenará a la hora de hacer el formulario.
		
		//Devolvemos el nombre del HTML que pinta el formulario.
		return "form";
	}
	
	
	@PostMapping("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado, Model model) {
		
		//Se añade al modelo, el empleado que se creará al recoger los datos del formulario.
		model.addAttribute("empleado", empleado);
		
		
		return "view";
	}
}
