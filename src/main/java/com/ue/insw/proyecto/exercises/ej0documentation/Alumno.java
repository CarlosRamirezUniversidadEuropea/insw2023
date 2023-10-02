package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

/**
 * Esta clase contiene los atributos y metodos de un Alumno
 * @version 1.0
 * @author Carlos Ramirez
 * @see Alumno
 */
public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 * Metodo constructor parametrizado
	 * @param nombre Nombre del alumno
	 * @param edad Edad del alumno
	 * @param sexo Sexo del alumno
	 * @param numeroExpediente Numero de expediente del alumno
	 * @param asignaturas Lista de asignaturas del alumno
	 * @param curso Curso del alumno
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
	 * Metodo para regresar el numero de expediente del alumno
	 * @return
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Metodo que le asigna el numero de expediente a un alumno
	 * @param numeroExpediente
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Metodo para regresar la lista de asignaturas del alumno
	 * @return
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Metodo que le asigna la lista de asignaturas a un alumno
	 * @param asignaturas
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo para regresar el curso del alumno
	 * @return
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Metodo que le asigna el curso a un alumno
	 * @param curso
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
