package com.ue.insw.proyecto.exercises.ej2herencia;

/**
 * Class Cat extends Animal and implements Speak
 */
public class Cat extends Animal implements Speak{

    /**
     * Constructor of Cat
     * @param breed
     * @param name
     * @param age
     * @throws Exception
     */
    public Cat(String breed, String name, int age) throws Exception {
        super(breed, name, age);
    }

    /**
     * Method toString to print the cat
     */
    @Override
    public String toString() {
        return "Cat [age=" + getAge() + ", breed=" + getBreed() + ", name=" + getName() + "]";
    }

    /**
     * Method to speak
     */
    @Override
    public void speak() {
        System.out.println("The cat " + getName() + " says: " + "Miau");
    }
}
