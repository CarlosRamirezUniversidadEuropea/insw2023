package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak

        Cat gato = new Cat("Gato","Juan",4);
        Dog perro = new Dog("Perro","Patas",11);
        Human humano = new Human("Humano","Lucas",19);

        gato.speak();
        perro.speak();
        humano.speak();

    }
}
