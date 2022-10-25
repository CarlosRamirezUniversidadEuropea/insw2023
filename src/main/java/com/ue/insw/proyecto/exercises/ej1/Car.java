package com.ue.insw.proyecto.exercises.ej1;

import static com.ue.insw.proyecto.exercises.ej1.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1.Status.STOPED;

//todo extender de Vehicle
//todo implementar Cleanable
public class Car {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;

    private Status status;

    public Car(Brand brand, Color color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;

        this.speed = 0;
        this.status = STOPED;
    }

    //todo javadoc
    public void on() {
        this.status = ON;
    }

    //todo javadoc
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //todo javadoc
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) {
        //todo Create method to fill car
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) {
        // todo Create method to start driving
    }
}
