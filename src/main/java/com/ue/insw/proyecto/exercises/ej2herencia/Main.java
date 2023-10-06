package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak

        Cat cat = new Cat("Persa", "Michi", "miau", 3);
        System.out.println(cat.toString());
        cat.speak();

        Dog dog = new Dog("Pitbull", "Firulais", "guau", 5);
        System.out.println(dog.toString());
        dog.speak();

        Human human = new Human("Humano", "Juan", "Hola!", 20);
        System.out.println(human.toString());
        human.speak();


    }
}
