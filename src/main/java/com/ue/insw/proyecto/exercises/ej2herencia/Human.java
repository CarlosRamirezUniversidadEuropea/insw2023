package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak {

    String raza;
    String nombre;
    int edad;

    public Human(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void speak() {
        System.out.println("Hola. Como estas?");

    }

    @Override
    public String toString() {
        return "Human [Su nombre es = " + nombre + ", es" + raza +
                " y  tiene " + edad + " años.";
    }
}