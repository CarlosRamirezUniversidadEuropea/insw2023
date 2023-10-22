package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    public Dog(String raza, String nombre) {
        super(raza, nombre);
    }
    @Override
    public void speak() {
        System.out.println("Guau guau...");

    }
    public String toString(){
        return "El perro "+getNombre()+" tiene "+ getEdad()+"años y es de raza "+getRaza();
    };
    // todo complete extends Animal implements speak, override methods
}
