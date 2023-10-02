package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;
/**
 * Esta clase contiene los atributos y metodos de un Alumno
 * @author Diego Rodriguez Camarmol
 * @version 1.0
 * @see Alumno
 */
public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 * Metodo constructor con los parámetros de un alumno
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param numeroExpediente
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
	 * Método para regresar el numero de expediente del alumno
	 * @return Regresa el numero de expediente.
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Método para actualizar el numero de expediente por parámetro
	 * @param numeroExpediente
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Método que crea una Lista de tipo string
	 * @return Regresa la lista de asignaturas que se le hayan pasado por parámetro
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}
	/**
	 * Método para actualizar el numero de expediente por parámetro
	 * @param asignaturas
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}
	/**
	 * Método para actualizar el numero de expediente por parámetro
	 * @return Regresa el curso del alumno
	 */
	public int getCurso() {
		return curso;
	}
	/**
	 * Método para actualizar el curso por parámetro
	 * @param curso
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}
	@Override
	/** Metodo para imprimir por pantalla el objeto en cuestión (Alumno)
	 * @return Regresa todos los parámetros o variables de un alumno (nombre, edad, sexo, numero de expediente,curso)
	 */
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
