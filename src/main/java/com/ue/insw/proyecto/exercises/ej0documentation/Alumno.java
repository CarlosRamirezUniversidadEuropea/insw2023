package com.ue.insw.proyecto.exercises.ej0documentation;
/**
 * Esta clase contiene los atributos y metodos de un alumno
 * @author Fabián Delgado Díez
 * @version 1.0
 * @see Alumno
 */
import java.util.List;


public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 * Método constructor con los parámetros de un alumno
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
	 * Metodo para regresar el numero de alumno
	 * @return numero de expediente
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * metodo para crear un nuevo numero de alumno
	 * @param numeroExpediente
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * metodo para devolver la Lista asignaturas
	 * @return lista de asignaturas
	 */
	public List<String> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * metodo para crear una nueva lista de asignaturas
	 * @param asignaturas
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * metodo para devolver el curso del alumno
	 * @return curso del alumno
	 */

	public int getCurso() {
		return curso;
	}

	/**
	 * metodo para crear que año cursa el alumno
	 * @param curso
	 */

	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * Método para imprimir el objeto alumno
	 * @return
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
