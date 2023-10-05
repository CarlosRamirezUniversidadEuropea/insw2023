package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak{
    /**
     * Constructor heredado de Animal
     * @param raza
     * @param nombre
     * @param edad
     */
    public Human(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }
    /**
     * Metodo que habla en el idioma de los humanos
     */
    @Override
    public void speak() {
        System.out.println("Mira, un GTR!");
    }

}
