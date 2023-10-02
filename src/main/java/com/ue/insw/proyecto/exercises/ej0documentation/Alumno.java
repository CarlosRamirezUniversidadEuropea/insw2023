package com.ue.insw.proyecto.exercises.ej0documentation;

import java.util.List;

/**
 * Esta clase contiene los atributos y metodos de un alumno
 *
 * @author Sergio Maza
 * @version 1.0
 * @see Persona
 */
public class Alumno extends Persona {

    private int numeroExpediente;
    private List<String> asignaturas;
    private int curso;

    /**
     * Metodo constructor parametrizado
     *
     * @param nombre           Nombre del alumno
     * @param edad             Edad del alumno
     * @param sexo             Sexo del alumno en formato H o M
     * @param numeroExpediente Numero de expediente
     * @param asignaturas      Asignaturas del alumno
     * @param curso            Curso del alumno
     */
    public Alumno(
            String nombre,
            int edad,
            char sexo,
            int numeroExpediente,
            List<String> asignaturas,
            int curso
    ) {
        super(nombre, edad, sexo);
        this.numeroExpediente = numeroExpediente;
        this.asignaturas = asignaturas;
        this.curso = curso;
    }

    /**
     * Metodo para regresar el numero de expediente
     *
     * @return Numero de expediente
     */
    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    /**
     * Metodo para establecer el numero de expediente
     *
     * @param numeroExpediente
     */
    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    /**
     * Metodo que regresa la lista de asignaturas
     *
     * @return Lista de asignaturas
     */
    public List<String> getAsignaturas() {
        return asignaturas;
    }

    /**
     * Metodo que añade una nueva asignatura
     *
     * @param asignaturas
     */
    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    /**
     * Metodo que regresa el curso
     *
     * @return Curso
     */
    public int getCurso() {
        return curso;
    }

    /**
     * Metodo para establecer el curso
     *
     * @param curso
     */
    public void setCurso(int curso) {
        this.curso = curso;
    }

    /**
     * toString de Alumno
     * @return String de datos de Alumno
     */
    @Override
    public String toString() {
        return "Alumno [numeroExpediente=" + numeroExpediente +
                ", asignaturas=" + asignaturas +
                ", curso=" + curso
                + "]";
    }
}
