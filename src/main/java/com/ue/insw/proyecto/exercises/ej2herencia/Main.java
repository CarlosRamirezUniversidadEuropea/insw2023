package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Dog d = new Dog("pomerania", "Max", 5);
        System.out.println("PERRO");
        System.out.println(d.toString());
        d.speak();
        Cat c = new Cat("bengalí", "Pelusa", 3);
        System.out.println("GATO");
        System.out.println(c.toString());
        c.speak();
        Human h = new Human("humano", "Pedro", 4);
        System.out.println("HUMANO");
        System.out.println(h.toString());
        h.speak();

    }
}
