package com.ue.insw.proyecto.exercises.ej0documentation;

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

	/**
	 * Método para devolver el número de empediente
	 * @return numeroExpediente
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Establece el numero del expediente del alumno
	 * @param numeroExpediente
	 */

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Devuelve una lista de asignaturas
	 * @return una lista de asignaturas
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Establece la lista de asignaturas del alumno
	 * @param asignaturas
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 *  Devuelve el numero del curso en el que esta el alumno
	 * @return numero del curso del alumno
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Establece el curso en el que se encuentra el alumno
	 * @param curso
	 */

	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * Sirve para imprimir los datos del alumno
	 * @return
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
