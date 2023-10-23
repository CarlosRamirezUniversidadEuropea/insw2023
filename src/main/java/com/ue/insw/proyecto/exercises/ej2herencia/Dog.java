package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    public Dog(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    @Override
    public void speak() {
        System.out.println("Guau");
    }
    // todo complete extends Animal implements speak, override methods

    public String toString(){
        return "Nombre: " + getNombre() + ", raza: " + getRaza() + ", edad: " + getEdad();
    }
}
