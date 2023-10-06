package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Cat cat = new Cat( siberiano, Luana, 4);
        System.out.println("Informacion del gato: ");
        System.out.println(cat.toString());
        cat.speak();

        Dog dog = new Dog(pastor_aleman, Yacob, 5);
        System.out.println("Informacion del perro: ");
        System.out.println(dog.toString());
        dog.speak();

        Human human = new Human(Carlos, 24);
        System.out.println("Informacion del humano:");
        System.out.println(human.toString());
        human.speak();
    }
}
