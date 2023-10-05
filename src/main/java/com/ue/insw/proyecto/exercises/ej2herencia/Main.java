package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Dog d = new Dog("pomerania", "Max");
        System.out.println("PERRO");
        d.speak();
        Cat c = new Cat("bengalí", "Pelusa");
        System.out.println("GATO");
        c.speak();
        Human h = new Human("humano", "Pedro");
        System.out.println("HUMANO");
        h.speak();

    }
}
