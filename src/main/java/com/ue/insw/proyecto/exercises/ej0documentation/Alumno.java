package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

public class Alumno extends Persona {
	/**
	 * Atributos de Alumno
	 * @param numeroExpediente número de expediente del alumno
	 * @param asignaturas Lista de asignaturas que cursa el alumno
	 * @param curso Número del curso que cursa el alumno
	 */
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 * Metodo constructor de la clase Alumno parametrizado
	 * @param nombre Nombre del alumno
	 * @param edad Edad del alumno
	 * @param sexo Sexo del alumno
	 * @param numeroExpediente Numero de expediente del alumno
	 * @param asignaturas Lista de asignaturas del alumno.
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
	 * Metodo que devuelve el número de expediente del alumno
	 * @return Numero de expediente
	 */

	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Se establecerá un nuevo número de expediente
	 * @param numeroExpediente Nuevo numero de expediente
	 */

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Devuelve la lista de asignaturas
	 * @return Lista de asignaturas del alumno
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Establece una nueva lista de asignaturas
	 * @param asignaturas Nueva lista de asignaturas a establecer
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Devuelve el curso del alumno
	 * @return curso actual del alumno
	 */

	public int getCurso() {
		return curso;
	}

	/**
	 * Establece un nuevo curso del alumno
	 * @param curso nuevo curso a establecer del alumno
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * Metodo que devuelve un string con todos los atributos del alumno
	 * @return String con todos los atributos del alumno
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
