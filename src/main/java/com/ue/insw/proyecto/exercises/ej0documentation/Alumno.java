package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

/** 
 * Esta clase contiene los atributos y metodos de un alumno
 * @version 1.0
 * @see Persona
*/
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
	 * Metodo para devolver el numero de expediente
	 * @return devuelve el numero de expediente
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Metodo para asignar el numero de expediente
	 * @param numeroExpediente, el numero de expediente a asignar
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Metodo para devolver las asignaturas
	 * @return devuelve una lista de asignaturas
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Metodo para asignar las asignaturas
	 * @param asignaturas, las asignaturas a asignar
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}


	/**
	 * Metodo para devolver el curso
	 * @return devuelve el curso
	 */
	public int getCurso() {
		return curso;
	}


	/**
	 * Metodo para asignar el curso
	 * @param curso, el curso a asignar
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	/**
	 * Metodo para devolver los datos del alumno
	 * @return un string con los datos del alumno
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
