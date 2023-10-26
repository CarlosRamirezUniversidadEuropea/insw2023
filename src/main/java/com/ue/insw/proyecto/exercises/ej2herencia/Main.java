package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Pitbull", "Cupcake", 5);
        Cat cat = new Cat("Angora", "Michi", 3);
        Human human = new Human("Humano", "Ishmael", 20);

        // Hacer que los animales hablen
        dog.speak();
        cat.speak();
        human.speak();
        
        // Mostrar los datos de los animales
        dog.toString();
        cat.toString();
        human.toString();
    }
}