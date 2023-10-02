package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

public class Alumno extends Persona {
	/**
	 * Metodo constructor parametrizado
	 * @param numeroExpediente Nombre del alumno
	 * @param asignaturas Edad del alumno
	 * @param curso Sexo del alumno en formato H o M
	 */
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 * Metodo constructor por defecto
	 */
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


	/**
	 * Metodo para regresar la edad de la persona
	 * @return Regresa la numeroExpediente de la persona
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Metodo que le asigna la edad a una persona
	 * @param numeroExpediente, la edad deseada a asignar
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Metodo para regresar el nombre de la persona
	 * @return Regresa el asignaturas de la persona
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Metodo que le asigna el nombre a una persona
	 * @param asignaturas, el nombre deseada a asignar
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo para regresar la edad de la persona
	 * @return Regresa el curso de la persona
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Metodo que le asigna la edad a una persona
	 * @param curso, la edad deseada a asignar
	 */
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
