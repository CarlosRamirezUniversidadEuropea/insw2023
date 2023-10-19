package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Cat cat = new Cat("gato","gato",8);
        Dog dog = new Dog("perro","perro",2);
        Human human = new Human("humana","Alex",19);

        cat.speak();
        dog.speak();
        human.speak();

    }
}
