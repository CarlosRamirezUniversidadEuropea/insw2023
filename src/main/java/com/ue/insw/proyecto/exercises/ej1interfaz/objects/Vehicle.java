package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

public class Vehicle {

    /**
     * Color of the car
     */
    private Color color;
    /**
     * Current speed of the car
     */
    private int speed;
    /**
     * Status of the car
     */
    private Status status;
    /**
     * Price of the vehicle
     */
    private BigDecimal price;
    /**
     * Maximum speed of the car
     */
    private int maxSpeed;


    /**
     * Method toString of the class vehicle
     * @return the information of the vehicle
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "color=" + color +
                ", speed=" + speed +
                ", status=" + status +
                ", price=" + price +
                '}';
    }

    /**
     * Constructor of the class Vehicle
     * @param color of the vehicle
     * @param price of the vehicle
     */
    public Vehicle (Color color, BigDecimal price, int maxSpeed) throws Exception {
        this.color = color;
        this.setPrice(price);
        this.setMaxSpeed(maxSpeed);
        this.speed = 0; // The car is stopped
        this.status = STOPED; // The car is stopped
    }
    /**
     * Constructor of the class Vehicle
     * @param price of the vehicle
     */
    public Vehicle(BigDecimal price) {
        this.price = price;
    }

    //todo
    /**
     * Turns on the vehicle
     */
    public void on() {
        this.status = ON;
    }

    //todo
    /**
     * Turns off the vehicle
     */
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    /**
     * Method to get the current speed of the vehicle
     * @return the current speed of the vehicle
     */
    public int getSpeed() {
        return speed;
    }

    //todo
    /**
     * Method to set the speed of the car. If the speed is negative, it throws an exception
     * @param speed of the car
     * @throws Exception if the speed is negative
     */
    public void setSpeed(int speed) throws Exception {
        if (speed <= 0 || speed > this.maxSpeed) {
            throw new Exception("Speed can't be negative or greater than the maximum speed");
        } else {
            this.speed = speed;
        }
    }

    /**
     * Gets the color of the car
     * @return color of the car
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the color of the car
     * @param color of the car
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Gets the status of the car
     * @return status of the car
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the car
     * @param status of the car
     */
    public void setStatus(Status status) throws Exception {
        // throw an exception if the status is not valid
        if (status != ON && status != STOPED) {
            throw new Exception("Invalid status");
        } else {
            this.status = status;
        }
    }

    /**
     * Gets the price of the car
     * @return price of the car
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the price of the car. If the price is negative, it throws an exception
     * @param price of the car
     */
    public void setPrice(BigDecimal price) throws Exception {
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new Exception("Price can't be negative");
        } else {
            this.price = price;
        }
    }

    /**
     * Gets the maximum speed of the car
     * @return maximum speed of the car
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the maximum speed of the car. If the speed is negative, it throws an exception
     * @param maxSpeed of the car
     * @throws Exception if the speed is negative
     */
    public void setMaxSpeed(int maxSpeed) throws Exception {
        if (maxSpeed < 0) {
            throw new Exception("Speed can't be negative");
        } else{
            this.maxSpeed = maxSpeed;
        }
    }
}
