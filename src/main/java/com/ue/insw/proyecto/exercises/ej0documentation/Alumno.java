package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;
/**
 * Esta clase contiene los atributos y metodos de un empleado
 * @author Carlos Ram�rez
 * @version 1.0
 * @see Alumno
 */
public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 *
	 * @param nombre Nombre del Alumno
	 * @param edad Edad del Alumno
	 * @param sexo Sexo del Alumno
	 * @param numeroExpediente Numero de expediente del Alumno
	 * @param asignaturas Asignaturas del alumno
	 * @param curso Curso actual del alumno
	 */

	public Alumno(String nombre, 
			int edad, 
			char sexo, 
			int numeroExpediente, 
			List<String> asignaturas, 
			int curso)

	{
		super(nombre, edad, sexo);
		this.numeroExpediente = numeroExpediente;
		this.asignaturas = asignaturas;
		this.curso = curso;
	}

	/**
	 * Metodo para regresar el numero de expediente
	 * @return Regresa el numero de expediente
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Establece el numero de expediente
	 * @param numeroExpediente Es el numero que se le asigna al expediente del alumno
	 */

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Este metodo te devuelve las asignaturas del alumno
	 * @return Regresa las asignaturas del alumno
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Metodo para establecer las asignaturas del alumno
	 * @param asignaturas Indica las asignaturas del alumno
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo que regresa el curso del alumno
	 * @return Regresa el curso del alumno
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Metodo que establece el curso del alumno
	 * @param curso Indica el curso del alumno
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * Metodo que devuelve todos los atributos del alumno
	 * @return todos los atributos del alumno
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
