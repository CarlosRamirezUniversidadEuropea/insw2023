package com.ue.insw.proyecto.exercises.ej2herencia;

/**
 * Clase que representa un perro
 * @author Pablo Ribas
 */
public class Dog extends Animal implements Speak {
    
    // Implementar constructor y llamar al super de Animal
    public Dog(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    // Implementar la interfaz speak y devolver como habla un perro
    @Override
    public void speak() {
        System.out.println("- Guau");
    }

    // Override toString
    @Override
    public String toString() {
        return "Perro " + getRaza() + ", llamado " + getNombre() + " y con " + getEdad() + " años de edad.";
    }

}