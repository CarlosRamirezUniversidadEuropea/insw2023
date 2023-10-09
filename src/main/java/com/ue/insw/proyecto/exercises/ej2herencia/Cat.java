package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak {

    public Cat(String raza, String nombre, int edad) {
        super(raza, nombre, edad);

    }



    @Override
    public void speak() {
       System.out.println( "El gato dice: Soy....El gato con bota´");
    }
    // todo extends Animal implements speak, override methods
}
