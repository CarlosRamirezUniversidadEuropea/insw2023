package com.ue.insw.proyecto.exercises.ej8pruebas;


import java.util.Objects;

/**
 * Class for mathematics calculations
 * 
 */
public class Calculator {
	
	public final static String EMPTY = "vacio";

	/**
	 * Calculates multiplication of two Integer parameters
	 * 
	 * @param a The first parameter
	 * @param b The second parameter
	 * @return The result of multiplying a by b 
	 */
    public int multiply(int a, int b) {
        return a * b;
    }
    public boolean valorNoNulo(String x){
		return x != null;
	}
    public String concat(String a, String b) {
		return (valorNoNulo(a) && valorNoNulo(b)) ? a+b: (valorNoNulo(a)) ? a: b;
	}
    public String concat2(String a, String b) {
		return Objects.requireNonNullElse(a, EMPTY) + Objects.requireNonNullElse(b, EMPTY);
		// Objects.requireNonNullElse(a, EMPTY) para manejar si a o b son null.
		// Si lo son, se reemplazan por un string null.
    }
}
