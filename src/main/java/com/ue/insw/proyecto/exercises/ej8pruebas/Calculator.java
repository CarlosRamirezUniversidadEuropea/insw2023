package com.ue.insw.proyecto.exercises.ej8pruebas;


/**
 * Class for mathematics calculations
 * 
 */
public class Calculator {
	
	public final static String EMPTY = "";

	/**
	 * Calculates multiplication of two Integer parameters
	 * 
	 * @param a The first parameter
	 * @param b The second parameter
	 * @return The result of multiplying a times b 
	 */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public String concat(String a, String b) {
    	if(b!=null && a !=null) {
    		return a+b;
    	} else if(a!=null){
    		return a;
    	} else {
    		return b;
    	}
    }
    
    public String concat2(String a, String b) {
    	if(b!=null && a !=null) {
    		return a.concat(b);
    	} else {
    		return EMPTY;
    	}
    }
}
