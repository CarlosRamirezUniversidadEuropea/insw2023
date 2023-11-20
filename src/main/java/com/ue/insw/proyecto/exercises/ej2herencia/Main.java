package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {
    public static void main(String[] args) {
        Dog perro= new Dog("Pastor aleman","Paco",3);
        Cat gato= new Cat("siames","sierra",5);
        Human humano= new Human("Caucasico","Noe",90);

        System.out.println(perro.toString());
        System.out.println(perro.speak("tengo hambre"));
        System.out.println(gato.quienSoy());
        System.out.println(humano.toString());

        //todo crear dog, cat y human y llamar a método speak

    }
}
