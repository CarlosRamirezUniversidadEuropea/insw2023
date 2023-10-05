package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak{
    /**
     * Constructor heredado de Animal
     * @param raza
     * @param nombre
     * @param edad
     */
    public Cat(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }
    /**
     * Metodo que habla en el idioma de los gatos
     */
    @Override
    public void speak() {
        System.out.println("miau miau");
    }
    // todo extends Animal implements speak, override methods
}
