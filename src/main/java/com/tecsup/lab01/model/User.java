package com.tecsup.lab01.model;

public class User {
		private String nombre;
		private String apellidop;
		private double edad;
		public User(String nombre, String apellidop, double edad) {
			this.nombre = nombre;
			this.apellidop = apellidop;
			this.edad = edad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidop() {
			return apellidop;
		}
		public void setApellidop(String apellidop) {
			this.apellidop = apellidop;
		}
		public double getEdad() {
			return edad;
		}
		public void setEdad(double edad) {
			this.edad = edad;
		}
		
}
