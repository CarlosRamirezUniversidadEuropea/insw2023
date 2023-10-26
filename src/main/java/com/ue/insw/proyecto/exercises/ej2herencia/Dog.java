package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{

    private String raza;
    private String nombre;
    private int edad;

   public Dog(String raza, String nombre, int edad){

       super(raza,nombre,edad);//llama a los constructores de la clase animal mediante super

   }

    @Override
    public String speak() {
        return "Guau, Guau";
    }  // mediante el override llamamos el metodo speak
    // todo complete extends Animal implements speak, override methods
//añadimos los getter's y setter's
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
