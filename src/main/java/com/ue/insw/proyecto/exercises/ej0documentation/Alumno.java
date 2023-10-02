package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

/**
 * Esta clase contiene los atributos y metodos de un alumno
 * @author Pablo Embil González
 * @version 1.0
 * @see Alumno
 */

public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 * Metodo constructor por defecto
	 */
	public Alumno(){
	}

	/**
	 * Metodo constructor parametrizado
	 * @param nombre Nombre del alumno
	 * @param edad Edad del alumno
	 * @param sexo Sexo del alumno en formato H o M
	 * @param numeroExpediente Numero de empleado
	 * @param asignaturas Asignaturas que cursa el alumno
	 * @param curso Curso en el que esta el alumno
	 */

	public Alumno(String nombre, int edad, char sexo, int numeroExpediente, List<String> asignaturas, int curso) {
		super(nombre, edad, sexo);
		this.numeroExpediente = numeroExpediente;
		this.asignaturas = asignaturas;
		this.curso = curso;
	}

	/**
	 * Metodo para regresar el numero del alumno
	 * @return Regresa el numero del alumno
	 */

	public int getNumeroExpediente() {

		return numeroExpediente;
	}


	/**
	 * Establece el numero del empleado
	 * @param numeroExpediente Numero que se le asignara al empleado
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Metodo para regresar las asignaturas del alumno
	 * @return Regresa las asignaturas del alumno
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Establece las asignaturas del alumno
	 * @param asignaturas Asignaturas del alumno
	 */

	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo para regresar el curso del alumno
	 * @return Regresa el curso del alumno
	 */

	public int getCurso() {
		return curso;
	}


	/**
	 * Establece el curso del alumno
	 * @param curso Curso del alumno
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * Metodo para establecer el toString()
	 * @return Información sobre el alumno
	 */

	@Override
	public String toString() {
		return "Alumno [numeroExpediente " + numeroExpediente +
				", asignaturas " + asignaturas +
				", curso " + curso
				+ "]";
	}

}
