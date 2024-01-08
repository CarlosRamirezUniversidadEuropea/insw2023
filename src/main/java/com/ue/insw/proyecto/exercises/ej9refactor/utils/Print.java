package com.ue.insw.proyecto.exercises.ej9refactor.utils;

public class Print {
	
	public Print(String palabra) {
		m1(palabra);
	}

	private void m1(String palabra) {
		//Nota: Se elimina las 70 veces que se imprime la palabra
		System.out.println(palabra);
	}
}
