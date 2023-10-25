package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Dog dog = new Dog("Perro","Perro",11);
        Cat cat = new Cat("Gato","Gato",12);
        Human human = new Human("Humana","Luis",13);

        dog.speak();
        cat.speak();
        human.speak();
    }
}
