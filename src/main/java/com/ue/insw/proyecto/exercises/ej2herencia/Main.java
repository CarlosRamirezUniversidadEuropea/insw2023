package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Cat cat = new Cat("Persa", "Micifu", 2);
        Dog dog = new Dog("Pitbull", "Pichu", 5);
        Human human = new Human("Blanco", "Diego", 19);
        cat.speak();
        dog.speak();
        human.speak();

    }
}
