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
	 * @param sexo Sexo del alumno en formato H o M
	 * @param numeroExpediente Numero de expediente que tendra el alumno
	 * @param asignaturas listas de asignaturas que cursara el alumno
	 * @param curso curso en el que estara el alumno
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
	 * Metodo para regresar el numero de expediente
	 * @return Regresa el numero de expediente del alumno
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Establece el numero de expediente
	 * @param numeroExpediente Numero de expediente que tendra cada alumno
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	/**
	 * Metodo que regresa una lista con las asignaturas del alumno
	 * @return Regresa la lista de asignaturas del alumno
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}
	/**
	 * Metodo que le asigna la lista con las asignaturas del alumno
	 * @param asignaturas lista de asignaturas
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo que regresa el curso del alumno
	 * @return Regresa un int que indica el curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Metodo que establece el curso del alumno
	 * @param curso Indica el curso del alumno
	 * */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * Devuelve una representación en forma de cadena de este objeto Alumno.
	 * Esta representación incluye el número de expediente, las asignaturas y el curso del alumno.
	 *
	 * @return Una cadena que representa este objeto Alumno.
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente +
				", asignaturas=" + asignaturas +
				", curso=" + curso
				+ "]";
	}

}
