package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak {

    /**
     * Esta clase contiene los atributos y metodos
     * @author Pablo Embil González
     * @version 1.0
     * @see Dog
     */
    public Dog(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    @Override
    public void speak() {
        System.out.println("Guau");
    }

    @Override
    public String toString() {
        return "Dog [Raza " + getRaza() +
                ", nombre " + getNombre() +
                ", edad " + getEdad()
                + "]";
    }
}
