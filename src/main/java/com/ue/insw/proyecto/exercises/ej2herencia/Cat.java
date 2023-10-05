package com.ue.insw.proyecto.exercises.ej2herencia;

/**
 * Clase que representa un gato
 * @author Pablo Ribas
 */
public class Cat extends Animal implements Speak {
    
    // Implementar constructor y llamar al super de Animal
    public Cat(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    // Implementar la interfaz speak y devolver como habla un gato
    @Override
    public void speak() {
        System.out.println("- Miau");
    }

    // Override toString
    @Override
    public String toString() {
        return "Gato " + getRaza() + ", llamado " + getNombre() + " y con " + getEdad() + " años de edad.";
    }

}
