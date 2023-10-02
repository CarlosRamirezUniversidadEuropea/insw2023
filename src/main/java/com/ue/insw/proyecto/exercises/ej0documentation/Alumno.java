package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;
	/**
	 * Metodo constructor por defecto
	 */
	/**
	 * Metodo constructor parametrizado
	 * @param nombre Nombre del Alumno
	 * @param edad Edad del alumno
	 * @param sexo Sexo del alumno en formato H o M
	 * @param numeroExpediente Numero de expediente del alumno
	 * @param asignaturas Listado de asignaturas que tiene cada alumno
	 * @param curso El curso en el que se encuentra cada alumno
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
	 * Metodo para regresar el numero de expediente de cada alumno
	 * @return Regresa el numero de expediente
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Establece el numero del expediente
	 * @param numeroExpediente Numero de expediente que se le asignara a cada alumno
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * Metodo para regresar las asignaturas de cada alumno
	 * @return Regresa las asignaturas del alumno
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}
	/**
	 * Establece las asignaturas de los alumnos
	 * @param asignaturas da las asignaturas a los alumnos
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo para regresar el curso de cada alumno
	 * @return Regresa las asignaturas del alumno
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Establece el cusro  de los alumnos
	 * @param curso  da las asignaturas a los alumnos
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
