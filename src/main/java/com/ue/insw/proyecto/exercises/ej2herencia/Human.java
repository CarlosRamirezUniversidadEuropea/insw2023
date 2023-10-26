package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?

// es una copia de dog cambiando los nombres por eso no lo comento
public class Human extends Animal implements Speak {

    private String raza;

    private String nombre;

    private int edad;


    public Human(String raza, String nombre, int edad){

        super(raza,nombre,edad);
    }

    @Override
    public String speak() {
        return "Hola que tal?";
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
