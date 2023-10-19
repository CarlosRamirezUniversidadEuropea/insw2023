package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements habalar {
    public Human(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    @Override
    public String speak() {
        return "Hola";
    }


}
