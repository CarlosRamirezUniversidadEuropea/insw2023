package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak {
    private String oficio;
    public Human(String raza, String nombre, String oficio, int edad) {
        super(raza, nombre, edad);
        this.oficio = oficio;
    }

    @Override
    public void speak() {
        System.out.println("Hola");
    }

    public String toString(){
        String aux = "Human = [raza = " + getRaza() + ", nombre = " + getNombre() + ", oficio = " + oficio + ", edad = " + getEdad() + "]";
        return aux;
    }
}
