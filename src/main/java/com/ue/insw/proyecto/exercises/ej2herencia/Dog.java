package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    /**
     * Constructor heredado de animal
     * @param raza
     * @param nombre
     * @param edad
     */
    public Dog(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    /**
     * Metodo que habla en el idioma de los perros
     */
    @Override
    public void speak() {
        System.out.println("wof, wof");
    }
}
    // todo complete extends Animal implements speak, override methods

