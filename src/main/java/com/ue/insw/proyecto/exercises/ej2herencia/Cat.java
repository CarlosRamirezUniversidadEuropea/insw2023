package com.ue.insw.proyecto.exercises.ej2herencia;

public class Cat extends Animal implements Speak{
    // todo extends Animal implements speak, override methods
    String colorOjos;
    boolean tieneZarpas;
    public Cat(String raza, String nombre, String colorOjos, boolean tieneZarpas, int edad) {
        super(raza, nombre, edad);
        this.colorOjos = colorOjos;
        this.tieneZarpas = tieneZarpas;
    }

    @Override
    public void speak() {
        System.out.println("Miau");
    }
    public String toString(){
        String aux = "Cat = [raza = " + getRaza() + ", nombre = " + getNombre() + ", colorOjos = " + colorOjos + ", tieneZarpas = " + tieneZarpas + ", edad = " + getEdad() + "]";
        return aux;
    }
}
