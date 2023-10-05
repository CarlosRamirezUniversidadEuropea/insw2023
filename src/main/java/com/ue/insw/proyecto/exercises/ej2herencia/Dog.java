package com.ue.insw.proyecto.exercises.ej2herencia;

import java.net.StandardSocketOptions;

public class Dog extends Animal implements Speak{
    public Dog(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    @Override
    public void speak() {
        System.out.print("Guau Guau!!");
    }
    // todo complete extends Animal implements speak, override methods
}
