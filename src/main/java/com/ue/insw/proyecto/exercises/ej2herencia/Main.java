package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Cat c = new Cat("Angora", "Misifu", 7);
        System.out.println(c.toString());
        c.speak();

        Dog d = new Dog("Pomerania", "ted", 5);
        System.out.println(d.toString());
        d.speak();

        Human h = new Human("Humano", "Fabián", 18);
        System.out.println(h.toString());
        h.speak();

    }
}

