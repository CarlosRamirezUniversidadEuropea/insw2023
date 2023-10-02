package com.ue.insw.proyecto.exercises.ej0documentation;

/**
 * Tiene los atributos y metodos de un alumno
 * @author Vidhi Sharma Devi
 */

import java.util.List; //

public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 *
	 * @param nombre Nombre del alumno
	 * @param edad Edad del alumno
	 * @param sexo Sexo del alumno
	 * @param numeroExpediente Numero del alumno
	 * @param asignaturas Asignaturas que realizará el alumno
	 * @param curso Curso que realizará el alumnno
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
	 * Metodo para regresar el numero de alumno
	 * @return
	 */


	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Establece el numero del alumno
	 * @param numeroExpediente Numero que se le asignara al alumno
	 */


	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Metodo que regresa asignaturas
	 * @return Regresa asignatura
	 */

	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Establece las asignaturas
	 * @param asignaturas Asignatura que se le asignara al alumno
	 */

	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo que regresa el curso del alumno
	 * @return Regresa un String que indica el curso
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

	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso +
				", nombre=" + getNombre() +
				", edad=" + getEdad() +
				", sexo=" + getSexo()
				+ "]";
	}

}
