package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak

import com.ue.insw.proyecto.exercises.ej3polimorfismo.Circle;

/**
 * Esta clase contiene los atributos y metodos
 * @author Pablo Embil González
 * @version 1.0
 * @see Animal
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

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
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


    @Override
    public String toString() {
        return "Animal [Raza " + getRaza() +
                ", nombre " + getNombre() +
                ", edad " + getEdad()
                + "]";
    }

}
