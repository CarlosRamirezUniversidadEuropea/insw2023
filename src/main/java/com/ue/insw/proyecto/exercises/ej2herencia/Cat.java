package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements habalar {
    public Cat(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
        this.raza=raza;
        this.nombre=nombre;
        this.setEdad(edad);
    }

    public String quienSoy(){
        return "soy un gato";
    }

    @Override
    public String speak(String mensaje) {
        return "Miau" + mensaje;
    }


    // todo extends Animal implements speak, override methods
}
