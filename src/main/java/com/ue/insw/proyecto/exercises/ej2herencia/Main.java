package com.ue.insw.proyecto.exercises.ej2herencia;
public class Main {
    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Dog d = new Dog("Husky Siberiano","Firulais",12);
        d.speak();
        Cat c = new Cat("Maltes","Whisky",7);
        c.speak();
        Human h = new Human("Humana","Iván",78);
        h.speak();

        d.toString();
        c.toString();
        h.toString();
    }
}
