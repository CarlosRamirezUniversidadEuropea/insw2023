package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Dog dog = new Dog("Pitbull", "mr. worldwide",2);
        Cat cat = new Cat("Siames", "gatito",4);
        Human jose = new Human("Human", "Jose",12);
        dog.speak();
        cat.speak();
        jose.speak();
    }
}
