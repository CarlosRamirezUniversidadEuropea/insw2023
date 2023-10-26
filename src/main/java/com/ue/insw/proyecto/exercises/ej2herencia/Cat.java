package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak{
    public Cat(String raza, String nombre, int edad) {

        super(raza, nombre, edad);
    }

    public void speak(){
        System.out.println("Miau miau...");

    }
    public String toString(){
        return "El gato "+getNombre()+" tiene "+ getEdad()+" años y es de raza "+getRaza();
    };
    // todo extends Animal implements speak, override methods
}
