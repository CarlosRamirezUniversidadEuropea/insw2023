package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

/**
 * Class Wheel that represents a wheel with its characteristics and actions that it can perform such as inflate, deflate, etc.
 */
public class Wheel {
    /**
     * Status of the wheel
     */
    private boolean inflated;


    /**
     * Constructor of the class Wheel
     */
    public Wheel() {
        //Usually a wheel is inflated
        this.inflated = true;
    }

    /**
     * Method toString of the class Wheel
     */
    @Override
    public String toString() {
        return "Wheel{" +
                "inflated=" + inflated +
                '}';
    }

    /**
     * Method to inflate the wheel
     */
    public void inflate() {
        this.inflated = true;
    }

    /**
     * Method to deflate the wheel
     */
    public void deflate() {
        this.inflated = false;
    }

    /**
     * Method to get the status of the wheel
     * @return the status of the wheel
     */
    public boolean isInflated() {
        return inflated;
    }
}
