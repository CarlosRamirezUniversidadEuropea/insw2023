package com.ue.insw.proyecto.exercises.ej9refactor.utils2;

import com.ue.insw.proyecto.exercises.ej9refactor.utils3.Clase1;

public class Calculate1 {
	
	public Calculate1(String palabra, boolean b) {
		int longitud = calculate(palabra);
		System.out.println("la longitud de la palabra es.."+ longitud);
	 
		new Clase1();
	}

/***
 * Este m�todo calcula la longitud de cualquier palabra
 * @param palabra
 * @return n�mero entero que dice la longitud de una palabra
 */
	public int calculate(String palabra) {
		//Devolver la longitud de la palabra
		return palabra.length();
	}

}
