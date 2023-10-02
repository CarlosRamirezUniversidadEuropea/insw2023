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
		
		//Bucle con salida directa, para esperar antes de dar la respuesta
		for(int i=0; i<10; i++){
			if(i==0)
				break;
			if(i!=0)
				break;
			if(i<5)
				break;
			if(i>5)
				break;
			else
				break;
		}

		//contar letras de hola
		if(palabra.equals("hola")){
			for(int j=0; j<5; j++){
				
				if(j==4){
					
				}
			}
		}
		
		//contar letras de adi�s
		if(palabra.equals("adi�s")){
			for(int j=0; j<5; j++){
				
				if(j==5){
					
				}
			}
		}
		
		
		//Devolver la longitud de la palabra
		return palabra.length();
	}

}
