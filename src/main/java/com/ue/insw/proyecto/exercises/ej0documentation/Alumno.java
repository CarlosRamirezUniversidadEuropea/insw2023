package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

/**
 * @author Paula Saenz
 * @version 1.0
 * @see Persona
 */

public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;


	/**
	 * Constructor parametrizado de la clase Alumno
	 * @param nombre Nombre del alumno
	 * @param edad Edad del alumno
	 * @param sexo Sexo del alumno en formato H o M
	 * @param numeroExpediente Número de expediente del alumno
	 * @param asignaturas Lista de asignaturas del alumno
	 * @param curso Curso actual del alumno
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
	 * Método para obtener el número de expediente del alumno
	 * @return El número de expediente del alumno
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Método para establecer el número de expediente del alumno
	 * @param numeroExpediente Número de expediente que se le asignará al alumno
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Método para obtener la lista de asignaturas del alumno
	 * @return La lista de asignaturas del alumno
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Método para establecer la lista de asignaturas del alumno
	 * @param asignaturas Lista de asignaturas que se asignarán al alumno
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Método para obtener el curso del alumno
	 * @return El curso actual del alumno
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Método para establecer el curso del alumno
	 * @param curso Curso que se asignará al alumno
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * Método que devuelve una representación en cadena de texto del objeto Alumno
	 * @return Cadena que representa el objeto Alumno
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
