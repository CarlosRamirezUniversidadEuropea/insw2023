package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;
/**
 * Esta clase contiene los atributos y metodos de un alumno
 * @author Jurgen Schuldt
 * @see Alumno
 */
public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 *
	 * @param nombre Nombre del alumno
	 * @param edad Edad del alumno
	 * @param sexo sexo del alumno
	 * @param numeroExpediente numero de expediemte del alumno
	 * @param asignaturas asignaturas que cursa el alumno
	 * @param curso numero de curso en el que esta el alumno
	 */
	public Alumno(String nombre, int edad, char sexo, int numeroExpediente, List<String> asignaturas, int curso) {
		super(nombre, edad, sexo);
		this.numeroExpediente = numeroExpediente;
		this.asignaturas = asignaturas;
		this.curso = curso;
	}

	/**
	 * Metodo para regresar el numero de expediente del alumno
	 * @return Regresa el numero del expediente del alumno
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
	 * Metodo para regresar las asignaturas del alumno
	 * @return Regresa las asignaturas del alumno
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}
	/**
	 * Establece las asignaturas del alumno
	 * @param asignaturas Numero que se le asignara al alumno
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo para regresar el curso del alumno
	 * @return Regresa el numero del curso del alumno
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Establece el curso del alumno
	 * @param curso Numero que se le asignara al alumno
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
