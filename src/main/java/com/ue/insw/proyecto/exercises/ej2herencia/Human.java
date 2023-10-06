package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak {

    private String nombre;
    private int edad;
    public Human(String nombre, int edad) {
        super(nombre, edad);
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    @Override
    public void speak() {
    }
    @Override
    public String toString(){
        return "Human [Me llamo = " + nombre + " y  tengo " + edad + " años.";
    }
}

