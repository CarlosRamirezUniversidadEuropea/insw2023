package com.ue.insw.proyecto.exercises.ej2herencia;

public class Dog extends Animal implements Speak{

    /**
     * Constructor of Dog
     * @param breed
     * @param name
     * @param age
     * @throws Exception
     */
        public Dog(String breed, String name, int age) throws Exception {
            super(breed, name, age);
        }

    /**
     * Method toString to print the dog
     */
    @Override
    public String toString() {
        return "Dog [age=" + getAge() + ", breed=" + getBreed() + ", name=" + getName() + "]";
    }

    /**
     * Method to speak
     */
    @Override
        public void speak() {
        System.out.println("The dog " + getName() + " says: " + "Guau");
        }
}
