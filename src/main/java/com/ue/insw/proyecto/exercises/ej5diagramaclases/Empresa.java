package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empresa {
    /**
     * Name of the company
     */
    private String nombre;

    /**
     * Constructor
     * @param name Name of the company
     */
    public Empresa(String name) {
        this.nombre = name;
    }

    /**
     * To string method to print the object
     */
    public String mostrar() {
        return "Empresa{" + "name=" + nombre + '}';
    }

    /**
     * Getter for the name of the company
     * @return Name of the company
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter for the name of the company
     * @param name Name of the company
     */
    public void setNombre(String name) {
        this.nombre = name;
    }
}
