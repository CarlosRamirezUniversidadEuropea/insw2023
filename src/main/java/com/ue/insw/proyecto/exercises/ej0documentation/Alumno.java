package com.ue.insw.proyecto.exercises.ej0documentation;
/**
 * Esta clase contiene los atributos y metodos de una Persona
 * @author Jose Vicente Delgado Berenguer
 * @version 1.0
 * @see Alumno
 */
import java.util.List;

public class Alumno extends Persona {
	
	private int numeroExpediente; 
	private List<String> asignaturas;
	private int curso;

	/**
	 *
	 * @param nombre nombre del alumno
	 * @param edad edad del alumno
	 * @param sexo sexo del aluno
	 * @param numeroExpediente numeroExpediente del alumno
	 * @param asignaturas asignaturas del alumno
	 * @param curso curso del alumno
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
	 * @return Regresa el numero de expediente del alumno
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * Metodo que le asigna el numero de Expediente del alumno
	 * @param numeroExpediente, el numero de expediene deseada a asignar
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
	 * Metodo que le asigna las asignaturas al alumno
	 * @param asignaturas, asignturas deseadas a asignar
	 */
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Metodo para regresar el curso del alumno
	 * @return Regresa el curso del alumno
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * Metodo que le asigna el curso del alumno
	 * @param curso, el curso deseado a asignar
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}
	/**
	 * Sobrescribe el método toString para obtener una representación de string del objeto Alumno.
	 *
	 */
	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + 
				", asignaturas=" + asignaturas + 
				", curso=" + curso
				+ "]";
	}

}
