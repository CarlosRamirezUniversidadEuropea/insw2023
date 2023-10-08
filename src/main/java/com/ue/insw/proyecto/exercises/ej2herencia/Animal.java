package com.ue.insw.proyecto.exercises.ej2herencia;

/**
 * Class that represents an animal
 * @see Speak
 */
public class Animal{

    /**
     * Breed of the animal
     */
    private String breed;
    /**
     * Name of the animal
     */
    private String name;
    /**
     * Age of the animal
     */
    private int age;

    /**
     * Constructor of the class Animal
     * @param breed
     * @param name
     * @param age
     */
    public Animal(String breed, String name, int age) throws Exception{
        this.breed = breed;
        this.name = name;
        // check if age is valid (age > 0) otherwise throw an exception
        if(age > 0) {
            this.age = age;
        } else {
            throw new Exception("Age must be greater than 0");
        }
    }

    /**
     * Get age of the animal
     * @return age of the animal
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Set age of the animal
     * @param age
     */
    public void setAge(int age) throws Exception{
        if (age > 0) {
            this.age = age;
        }else {
            throw new Exception("Age must be greater than 0");
        }
    }

    /**
     * Method to get the breed of the animal
     * @return breed of the animal
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * Method to set the breed of the animal
     * @param breed breed of the animal
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Method to get the name of the animal
     * @return name of the animal
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method to set the name of the animal
     * @param name name of the animal
     */
    public void setName(String name) {
        this.name = name;
    }

}
