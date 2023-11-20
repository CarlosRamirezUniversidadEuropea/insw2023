package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak
public class Animal implements habalar{

    String raza;
    String nombre;
    private int edad;

    public Animal(String raza, String nombre,int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad= edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " Animal { "+" Raza:"+raza+" Nombre: "+nombre+" Edad: "+edad+ " Speak: "+" } ";

    }

    @Override
    public String speak(String mensaje) {
        return mensaje;
    }
}
