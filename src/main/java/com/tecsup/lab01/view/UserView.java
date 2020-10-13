package com.tecsup.lab01.view;
import com.tecsup.lab01.controller.*;

public class UserView {
	UserController usuario = new UserController();
	public static void main(String [] args) {
		System.out.println("Nombre completo: "+usuario.obtenerNombre());
		System.out.println("Edad: "+usuario.obtenerNombre());
	}
}
