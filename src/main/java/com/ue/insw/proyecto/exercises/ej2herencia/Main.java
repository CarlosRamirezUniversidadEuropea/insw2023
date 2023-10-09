package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Cat c = new Cat("Persa", "Chispas", 6);
        System.out.println(c.toString());
        c.speak();
        Dog d = new Dog("Bichon Maltes", "Byron", 1);
        System.out.println(d.toString());
        d.speak();
        Human h = new Human("Homo Sapiens", "Vidhi", 18);
        System.out.println(h.toString());
        h.speak();
    }
}
