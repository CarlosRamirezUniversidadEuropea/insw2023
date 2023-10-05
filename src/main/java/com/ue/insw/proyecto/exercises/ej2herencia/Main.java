package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        // Instancias de objetos
        Cat cat = new Cat("Persa", "Micifu", 2);
        Dog dog = new Dog("Pitbull", "Pichu", 5);
        Human human = new Human("Blanco", "Diego", 19);

        // Metodos speak
        cat.speak();
        dog.speak();
        human.speak();

        // Metodos toString
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(human);
    }
}
