package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Dog dog = new Dog("Perro","Perro");
        Cat cat = new Cat("Gato","Gato");
        Human human = new Human("Humana","Luis");

        dog.speak();
        cat.speak();
        human.speak();
    }
}
