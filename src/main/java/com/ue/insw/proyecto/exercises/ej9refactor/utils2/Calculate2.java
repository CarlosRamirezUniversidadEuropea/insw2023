package com.ue.insw.proyecto.exercises.ej9refactor.utils2;

public class Calculate2 {
	
	private String palabra;
	private boolean verdad;
	private int atributoSinUso;

	
	public Calculate2(String p, boolean b) {
		palabra = p;
		verdad = b;
	}
	

	
	public void setPalabra(String p){
		this.palabra = p;
	}
	
	public String getPalabra(){
		return palabra;
	}

	
}

