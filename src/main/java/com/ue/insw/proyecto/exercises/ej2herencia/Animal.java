package com.ue.insw.proyecto.exercises.ej2herencia;

/**
 * Clase que representa un animal
 * @autor Pablo Ribas
 */
public class Animal {

    private String raza;
    private String nombre;
    private int edad;

    public Animal(String raza, String nombre, int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
