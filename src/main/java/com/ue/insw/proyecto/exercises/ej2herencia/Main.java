package com.ue.insw.proyecto.exercises.ej2herencia;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        //todo crear dog, cat y human y llamar a método speak
        Dog a = new Dog("pastor aleman", "a");
        System.out.println("ruido del perro");
        a.speak();
        Cat c = new Cat("asiatico", "c");
        System.out.println("ruido del gato");
        c.speak();
    }
}
