package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak

        Dog perro = new Dog("Pastor Aleman","Rex", 7);
        Cat gato = new Cat("egipcio" ,"botas", 1);
        Human humano = new Human("albino","paco",23);

// creados dog, cat , human toca probarlos llamando al metodo speak


        System.out.println(perro.toString()  +  " dice: " + perro.speak() );


        System.out.println(gato.toString()+ " dice: " + gato.speak());
        System.out.println("el gato dice: " + gato.speak());

        System.out.println(humano.toString()+" dice: " + humano.speak());
    }
}
