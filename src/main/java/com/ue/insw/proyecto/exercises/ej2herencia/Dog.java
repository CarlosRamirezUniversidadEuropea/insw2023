package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    public Dog(String raza, String nombre) {
        super(raza, nombre);
    }

    // todo complete extends Animal implements speak, override methods
    @Override
    public void speak() {
        System.out.println("Woof");
    }
}