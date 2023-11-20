package com.ue.insw.proyecto.exercises.ej9refactor.utils;

public class Print {
	
	public Print(String palabra) {
		m1(palabra);
	}

	private void m1(String palabra) {
		//Imprime palabra 70 veces
		for(int i =0; i<70;i++){
			System.out.println(palabra);
		}
		
	}

}
