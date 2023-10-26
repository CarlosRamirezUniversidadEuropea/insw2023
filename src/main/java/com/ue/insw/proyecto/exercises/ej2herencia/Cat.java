package com.ue.insw.proyecto.exercises.ej2herencia;

//es una copia de dog por eso no hay comentarios
public class Cat extends Animal implements Speak{

    private String raza;
    private String nombre;

    private int edad;
    public Cat(String raza, String nombre, int edad) {
        super(raza, nombre, edad);


    }

    @Override
    public String speak() {
        return "Miau, miau";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
    // todo extends Animal implements speak, override methods

