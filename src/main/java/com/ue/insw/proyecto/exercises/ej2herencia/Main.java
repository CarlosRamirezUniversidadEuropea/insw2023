package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Cat cat = new Cat("Siames", "Bigotes", "Verdes", true, 3);
        Dog dog = new Dog("Pitbull", "Princesa", "Negro", 3);
        Human human = new Human("N/A","Arnaldo", "Informatico", 25);

        cat.speak();
        dog.speak();
        human.speak();

        System.out.println("----------------------------------------------------------------");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(human);

    }
}
