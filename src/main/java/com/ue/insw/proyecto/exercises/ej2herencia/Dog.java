package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements habalar {
    public Dog(String raza, String nombre, int edad) {
        super(raza, nombre, edad);

    }

    @Override
    public String speak(String mensaje) {
        return "guau" + mensaje;
    }


    // todo complete extends Animal implements speak, override method
    //
}
