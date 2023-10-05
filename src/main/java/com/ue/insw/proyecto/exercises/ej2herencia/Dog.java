package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak {
    private String sonido;

    // todo extends Animal implements speak, override methods

    public Dog(String raza, String nombre, String sonido) {
        super(raza, nombre);
        this.sonido = sonido;

    }

    @Override
    public void speak() {
        System.out.println("El perro hace " + sonido);
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }



    public String toString() {
        return "Perro sonido=" + sonido + ", raza=" + getRaza() + ", nombre=" + getNombre() + ".";
    }
}
