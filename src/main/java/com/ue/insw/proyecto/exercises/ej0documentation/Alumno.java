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
	 * metodo para obtener el numero de expediente del alumno
	 * @return devuelve numero de expediente
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 *metodo para establecer el numero de expediente del alumno
	 * @param numeroExpediente
	 */

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 *metodo para obtener las asignaturas de expediente del alumno
	 * @return devuelve asignaturas
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 *metodo para establecer las asignaturas de expediente del alumno
	 * @param asignaturas
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 *metodo para obtener el curso de expediente del alumno
	 * @return devuelve el curso
	 */

	public int getCurso() {
		return curso;
	}

	/**
	 *metodo para establecer el curso de expediente del alumno
	 * @param curso
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 *metodo para imprimir los atributos del alumno
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
