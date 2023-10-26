package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

/**
 * Metodo constructor por defecto
 */

public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 *
	 * @param nombre Nombre del alumno
	 * @param edad Edad del alumno
	 * @param sexo Sexo del alumno en formato H o M
	 * @param numeroExpediente numero de expediente
	 * @param asignaturas asignaturas del alumno
	 * @param curso curso en el cual esta el alumno
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
	 * Metodo para regresar el numero del expediente
	 * @return Regresa el numero del expediente
	 */

	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Establece el numero del expediente
	 */

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 *  Metodo para regresar la lista de asignaturas
	 * @return Regresa la lista de asignaturas
	 */

	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Metodo que le asignan las asignaturas del alumno
	 * @param asignaturas asignaturas del alumno
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo para regresar el curso
	 * @return Regresa el curso del alumno
	 */

	public int getCurso() {
		return curso;
	}

	/**
	 * Metodo que lee el curso
	 * @param curso numero de curso del alumno
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
