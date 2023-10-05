package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak {

    /**
     * Esta clase contiene los atributos y metodos
     * @author Pablo Embil González
     * @version 1.0
     * @see Human
     */
    public Human(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    @Override
    public void speak() {
        System.out.println("Hola");
    }

    @Override
    public String toString() {
        return "Human [Raza " + getRaza() +
                ", nombre " + getNombre() +
                ", edad " + getEdad()
                + "]";
    }
}
