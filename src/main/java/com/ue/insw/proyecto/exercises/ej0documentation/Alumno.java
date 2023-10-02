package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 *
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
	 * Recibes el numero de expediente
	 * @return
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 *
	 * @param numeroExpediente
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 *
	 * @return
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 *
	 * @param asignaturas
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 *
	 * @return
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 *
	 * @param curso
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso + ", Nombre="+ getNombre() + ", Edad=" + getEdad() + ", Sexo=" + getSexo()
				+ "]";
	}

}
