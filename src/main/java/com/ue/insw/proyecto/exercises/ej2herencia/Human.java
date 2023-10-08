package com.ue.insw.proyecto.exercises.ej2herencia;

/**
 * Class Human extends Animal and implements Speak
 */
public class Human extends Animal implements Speak{

        /**
        * Constructor of Human
        * @param breed
        * @param name
        * @param age
        * @throws Exception
        */
        public Human(String breed, String name, int age) throws Exception {
            super(breed, name, age);
        }

    /**
     * Method toString to print the human
     */
    @Override
    public String toString() {
        return "Human [age=" + getAge() + ", breed=" + getBreed() + ", name=" + getName() + "]";
    }


    /**
     * Method to speak
        */
        @Override
        public void speak() {
            System.out.println("The human " + getName() + "nsays: " + "Hello");
        }
}
