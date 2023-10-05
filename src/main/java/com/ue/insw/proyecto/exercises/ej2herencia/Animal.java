package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak
public class Animal{

    private String raza;
    private String nombre;
    private int edad;

    /**
     * Contructor parametrizado de Animal
     * @param raza Raza del animal
     * @param nombre Nombre del animal
     * @param edad Edad del animal
     */
    public Animal(String raza, String nombre, int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo para conseguir la edad
     * @return Edad del animal
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo para establecer la edad
     * @param edad Edad del animal
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
