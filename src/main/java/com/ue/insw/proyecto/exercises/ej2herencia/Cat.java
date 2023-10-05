package com.ue.insw.proyecto.exercises.ej2herencia;
// todo extends Animal implements speak, override methods
    public class Cat extends Animal implements Speak{
    String raza;
    String nombre;
    int edad;
    public Cat(String raza, String nombre, int edad) {
        super(raza, nombre);
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

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
