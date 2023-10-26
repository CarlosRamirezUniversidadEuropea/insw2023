package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Dog dog = new Dog("Perro","Silver",10);
        Cat cat = new Cat("Gato","Gato",3);
        Human human = new Human("Humano","David",25);

        dog.speak();
        cat.speak();
        human.speak();
    }
}
