package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak

        Dog firulais = new Dog("labrador", "Firulais", 2);
        Cat canela = new Cat("egipcio", "Canela", 9);
        Human diego = new Human("humano", "Diego", 12);
        firulais.speak();
        canela.speak();
        diego.speak();

        System.out.println(firulais.toString());
        System.out.println(canela.toString());
        System.out.println(diego.toString());

    }
}
