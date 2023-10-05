package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{
    // todo complete extends Animal implements speak, override methods
    String color;
    public Dog(String raza, String nombre, String color, int edad) {
        super(raza, nombre, edad);
        this.color = color;
    }

    @Override
    public void speak() {
        System.out.println("Guau");
    }
    public String toString(){
        String aux = "Dog = [raza = " + getRaza() + ", nombre = " + getNombre() + ", color = " + color + ", edad = " + getEdad() + "]";
        return aux;
    }
}
