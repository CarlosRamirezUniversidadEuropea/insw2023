package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak{
    // todo extends Animal implements speak, override methods
    public Human(String raza, String name, int edad) {
        super(raza, name,edad);
    }

    public void speak() {
        System.out.println("Hola");
    }
    public void speak(String dialogo) {
        System.out.println(dialogo);
    }
}
