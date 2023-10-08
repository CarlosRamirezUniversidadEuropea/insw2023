package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) throws Exception {
        //todo crear dog, cat y human y llamar a método speak
        //Creating a dog, cat and human and calling speak method
        Cat persa = new Cat("Persa", "Candela", 2);
        Dog pastorAleman = new Dog("Pastor Alemán", "Luna", 3);
        Human juan = new Human("Human", "Juan", 25);
        // Speaking
        System.out.println("--------------------SPEAKING--------------------");
        persa.speak();
        pastorAleman.speak();
        juan.speak();
        System.out.println("--------------------OBJECTS--------------------");
        System.out.println(persa);
        System.out.println(pastorAleman);
        System.out.println(juan);
    }
}
