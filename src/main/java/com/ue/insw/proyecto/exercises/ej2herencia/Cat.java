package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak{
    public Cat(String raza, String nombre, int edad) {super(raza, nombre, edad);
    }
// todo extends Animal implements speak, override methods

    @Override
    public void speak(){System.out.println("Miauuu");}
}
