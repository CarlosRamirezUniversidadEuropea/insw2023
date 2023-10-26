package com.ue.insw.proyecto.exercises.ej2herencia;


public class Main {

    public static void main(String[] args) {
        //todo crear dog, cat y human y llamar a método speak
        Cat cat = new Cat("Bombay", "Salem", 3);
        System.out.println("Cat: " + cat.speak());
        System.out.println(cat.toString());
        System.out.println("-----------------------------------------");


        Dog dog = new Dog("Chihuahua", "Coco", 1);
        System.out.println("Dog: " + dog.speak());
        System.out.println(dog.toString());
        System.out.println("-----------------------------------------");



        Human human = new Human("Homo sapiens", "Alba", 30);
        System.out.println("Human: " + human.speak());
        System.out.println(human.toString());

    }

    }

