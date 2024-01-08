package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Pitbull", "Cupcake", 5);
        Cat cat = new Cat("Angora", "Michi", 3);
        Human human = new Human("Humano", "Ishmael", 20);

        // Hacer que los animales hablen
        System.out.println("El perro dice: ");
        dog.speak();
        System.out.println("El gato dice: ");
        cat.speak();
        System.out.println("El humano dice: ");
        human.speak();

        System.out.println();
        
        // Mostrar los datos de los animales
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(human.toString());
    }
}