package com.ue.insw.proyecto.exercises.documentation;

import java.util.List;

public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;


	public Alumno(String nombre, 
			int edad, 
			char sexo, 
			int numeroExpediente, 
			List<String> asignaturas, 
			int curso) {
		super(nombre, edad, sexo);
		this.numeroExpediente = numeroExpediente;
		this.asignaturas = asignaturas;
		this.curso = curso;
	}


	public int getNumeroExpediente() {
		return numeroExpediente;
	}


	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	public List<String> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}


	public int getCurso() {
		return curso;
	}


	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
