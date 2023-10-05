package com.ue.insw.proyecto.exercises.ej2herencia;

/**
 * Clase que representa un humano
 * @author Pablo Ribas
 */
public class Human extends Animal implements Speak {

    // Implementar constructor y llamar al super de Animal
    public Human(String raza, String nombre, int edad) {
        super(raza, nombre, edad);
    }

    // Implementar la interfaz speak y devolver como habla un humano
    @Override
    public void speak() {
        System.out.println("- Hey, muy buenas a todos");
    }

    // Override toString
    @Override
    public String toString() {
        return "Humano " + getRaza() + ", llamado " + getNombre() + " y con " + getEdad() + " años de edad.";
    }

}
