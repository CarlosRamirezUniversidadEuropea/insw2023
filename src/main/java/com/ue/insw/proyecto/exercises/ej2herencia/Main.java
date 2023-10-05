package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Cat cat = new Cat("comun europeo","bigotes",8);
        Dog dog = new Dog("Bodeguero Andaluz","Bran",6);
        Human Mazita = new Human("blanco","Sergio",19);

        cat.speak();
        dog.speak();
        Mazita.speak();
        System.out.println(cat.toString() +"\n" +Mazita.toString() +"\n" + dog.toString());
    }
}
