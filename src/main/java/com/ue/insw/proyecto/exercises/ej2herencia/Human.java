package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak {
    private String sonido;

    // todo extends Animal implements speak, override methods

    public Human(String raza, String nombre, String sonido, int edad) {
        super(raza, nombre);
        this.sonido = sonido;

    }

    @Override
    public void speak() {
        System.out.println("El humano hace " + sonido);
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }



    public String toString() {
        return "Humano sonido=" + sonido + ", raza=" + getRaza() + ", nombre=" + getNombre() + ".";
    }
}
