package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak

        Dog firulais = new Dog("labrador", "Firulais");
        Cat canela = new Cat("egipcio", "Canela");
        Human diego = new Human("humano", "Diego");
        firulais.speak();
        canela.speak();
        diego.speak();

        firulais.toString();
        canela.toString();
        diego.toString();

    }
}
