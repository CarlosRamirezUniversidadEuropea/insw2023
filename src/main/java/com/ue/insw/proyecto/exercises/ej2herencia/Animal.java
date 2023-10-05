package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak
public class Animal{

    private String raza;
    private String nombre;
    private int edad;

    /**
     * Constructor
     * @param raza La raza del animal
     * @param nombre El nombre del animal
     * @param edad La edad del animal
     */
    public Animal(String raza, String nombre, int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo que te devuelve la edad
     * @return la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo que te permite cambiar la edad
     * @param edad te pude la edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
