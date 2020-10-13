package com.tecsup.lab01.controller;

import com.tecsup.lab01.model.*;

public class UserController {
	
	User u = new User("Esteban","Quito",18);
	
	public String ObtenerNombre() {
		String nombres = u.getNombre()+" "+u.getApellidop();
		return nombres;
	}
	public double ObtenerEdad() {
		double edad = u.getEdad();
		return edad;
	}
}
