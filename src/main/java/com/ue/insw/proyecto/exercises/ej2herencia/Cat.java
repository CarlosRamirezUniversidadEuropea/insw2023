package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak {
    private String sonido;

    // todo extends Animal implements speak, override methods

    public Cat(String raza, String nombre, String sonido) {
        super(raza, nombre);
        this.sonido = sonido;

    }

    @Override
    public void speak() {
        System.out.println("El gato hace " + sonido);
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }



    public String toString() {
        return "Gato sonido=" + sonido + ", raza=" + getRaza() + ", nombre=" + getNombre() + ", edad=" + getEdad();
    }
}
