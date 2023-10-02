package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

/**
 * Esta clase contiene los atributos y metodos de un alumno
 * @author Carlos Ram�rez
 * @version 1.0
 * @see Persona
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
	 * Metodo que devuelve el numero de expediente del alumno
	 * @return Numero de expediente del alumno
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Metodo que establece el numero de expediente del alumno
	 * @param numeroExpediente
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Metodo que devuelve la lista de asignaturas del alumno
	 * @return
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Metodo que establece la lista de asignaturas del alumno
	 * @param asignaturas
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo que devuelve el curso del alumno
	 * @return
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Metodo que establece el curso del alumno
	 * @param curso
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	/**
	 * Metodo que devuelve todos los datos del alumno
	 * @return Parámetros del alumno
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
