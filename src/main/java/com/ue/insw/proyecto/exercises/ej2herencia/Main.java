package com.ue.insw.proyecto.exercises.ej2herencia;

public class Main {

    public static void main(String[] args) {

        // Crear un perro, un gato y un humano
        Dog dog = new Dog("Pastor Aleman", "Toby", 5);
        Cat cat = new Cat("Siames", "Michi", 3);
        Human human = new Human("Español", "Pablo", 25);

        System.out.println("Ejercicio 2: Herencia");
        System.out.println("Realizado por Pablo Ribas Borrego (AWDn0n)\n");

        // Mostrar por pantalla los toString y speak() de cada uno
        System.out.println(dog.toString());
        dog.speak();
        System.out.println();
        System.out.println(cat.toString());
        cat.speak();
        System.out.println();
        System.out.println(human.toString());
        human.speak();

    }
}
