package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Persona {
    /**
     * Name of the person
     */
    private String nombre;
    /**
     * Age of the person
     */
    private int edad;

    /**
     * Constructor
     * @param name Name of the person
     * @param age Age of the person
     */
    public Persona(String name, int age) {
        this.nombre = name;
        this.edad = age;
    }

    /**
     * To string method to print the object
     */
    @Override
    public String toString() {
        return "Persona{" + "name=" + nombre + ", age=" + edad + '}';
    }

    /**
     * Getter for the name of the person
     * @return Name of the person
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter for the name of the person
     * @param name Name of the person
     */
    public void setNombre(String name) {
        this.nombre = name;
    }

    /**
     * Getter for the age of the person
     * @return Age of the person
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter for the age of the person
     * @param age Age of the person
     */
    public void setEdad(int age) {
        this.edad = age;
    }

}
