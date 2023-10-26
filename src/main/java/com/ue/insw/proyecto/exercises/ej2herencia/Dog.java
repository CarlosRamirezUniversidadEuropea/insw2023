package com.ue.insw.proyecto.exercises.ej2herencia;
// todo complete extends Animal implements speak, override methods
public class Dog extends Animal implements Speak{
    private String raza;
    private String nombre;
    private int edad;
    public Dog(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
        this.raza = raza;
        this.nombre = nombre;
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public void speak() {
        System.out.println("woof");

    }
    @Override
    public String toString(){
        return "Perro [Su nombre es = " + nombre + ", es" + raza +
                " y  tiene " + edad + " años.";
    }
}
