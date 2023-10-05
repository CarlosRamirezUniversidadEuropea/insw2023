package com.ue.insw.proyecto.exercises.ej2herencia;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        //todo crear dog, cat y human y llamar a método speak
        Dog a = new Dog("pastor aleman", "a", 4);
        System.out.println("perro:");
        a.speak();
        Cat c = new Cat("asiatico", "c", 3);
        System.out.println("gato:");
        c.speak();
        Human h = new Human("humano:", "jose", 19);
        System.out.println("humano:");
        h.speak();
    }
}
