package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        Dog Chacal = new Dog("Mezcla","Chacal",11);
        Chacal.toString();
        Chacal.speak();
        Cat Canela = new Cat("Persa","Canela",9);
        Canela.toString();
        Canela.speak();
        Human Pablo = new Human("Caucasico","Pablo",21);
        Pablo.toString();
        Pablo.speak();

    }
}
