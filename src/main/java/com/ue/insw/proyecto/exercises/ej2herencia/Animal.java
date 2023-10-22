package com.ue.insw.proyecto.exercises.ej2herencia;

// todo implements Speak
public class Animal implements Speak{
    private String raza;
    private String nombre;
    private int edad;
    public Animal(String raza, String nombre,int e) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = e;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
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

    public String toString(){
        return "Animal: "+raza+"\n"+
                "Nombre: "+nombre+"\n"+
                "Edad: "+edad;
    }
    @Override
    public void speak() {
    }
}
