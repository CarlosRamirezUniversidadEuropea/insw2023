package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

/**
 * This class contains the attributes and methods of an Alumno
 * @author Cristina Guerrero
 * @version 1.0
 * @see Persona
 */
public class Alumno extends Persona {
	
	/**
	 * The student's ID number.
	 */
	private int numeroExpediente; 
	
	/**
	 * The list of subjects the student is enrolled in.
	 */
	private List<String> asignaturas;
	
	/**
	 * The course the student is taking.
	 */
	private int curso;


	/**
	 * Parameterized constructor method
	 * @param nombre The student's name.
	 * @param edad The student's age.
	 * @param sexo The student's gender.
	 * @param numeroExpediente The student's ID number.
	 * @param asignaturas The list of subjects the student is enrolled in.
	 * @param curso The course the student is taking.
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
	 * Returns a string representation of the student object.
	 * @return A string representation of the student object.
	 */
	@Override
	public String toString() {
		return "Alumno{" +
				"nombre='" + getNombre() + '\'' +
				", edad=" + getEdad() +
				", sexo=" + getSexo() +
				", numeroExpediente=" + this.numeroExpediente +
				", asignaturas=" + this.asignaturas +
				", curso=" + this.curso +
				'}';
	}

	/**
	 * Method to return student's ID number.
	 * @return The student's ID number.
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}


	/**
	 * Sets the student's ID number.
	 * @param numeroExpediente The student's ID number.
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Method to get the list of subjects the student is enrolled in.
	 * @return The list of subjects the student is enrolled in.
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * Sets the list of subjects the student is enrolled in.
	 * @param asignaturas The list of subjects the student is enrolled in.
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}


	/**
	 * Method to get the course the student is taking.
	 * @return The course the student is taking.
	 */
	public int getCurso() {
		return curso;
	}


	/**
	 * Sets the course the student is taking.
	 * @param curso The course the student is taking.
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

}
