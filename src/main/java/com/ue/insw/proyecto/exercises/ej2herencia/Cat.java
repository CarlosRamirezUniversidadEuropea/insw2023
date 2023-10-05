package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak {

    /**
     * Esta clase contiene los atributos y metodos
     * @author Pablo Embil González
     * @version 1.0
     * @see Cat
     */
    public Cat(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    @Override
    public void speak() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return "Cat [Raza " + getRaza() +
                ", nombre " + getNombre() +
                ", edad " + getEdad()
                + "]";
    }
}
