package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

/**
 * Esta clase contiene los atributos y metodos de un alumno
 * @author Maylen
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
	 * @param numeroExpediente Numero de expediente
	 * @param asignaturas
	 * @param curso
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
	 * Establece el numero de expediente
	 * @param numeroExpediente Numero de expediente que se le asignara al alumno
	 */

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Metodo para regresar los nunmeros de las asignaturas
	 * @return
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Establece el numero de asignaturas
	 * @param asignaturas Asignaturas que se le asignara al alumno
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo para regresar los numeros de los cursos
	 * @return
	 */

	public int getCurso() {
		return curso;
	}

	/**
	 * Establece el numero de cursos
	 * @param curso Cursos que se le asignara al alumno
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
