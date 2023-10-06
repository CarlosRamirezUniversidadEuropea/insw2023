package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak

        Cat c = new Cat("siames", "Federico", 5);
        Dog d = new Dog("labrador", "Pepe", 10);
        Human h = new Human("homosapiens", "Victor", 18);

        c.speak();
       System.out.println(c.toString());

        d.speak();
       System.out.println(d.toString());

        h.speak();
       System.out.println(h.toString());




    }
}
