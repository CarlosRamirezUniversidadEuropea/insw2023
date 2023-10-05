package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implementar Cleanable

/**
 * Class that represents a car with its characteristics and actions that it can perform such as driving, stopping, etc.
 * @see Vehicle
 * @see Cleanable
 */
public class Car extends Vehicle implements Cleanable {

    /**
     * Brand of the car
     */
    private Brand brand;
    /**
     * Color of the car
     */
    private Color color;
    /**
     * Maximum speed of the car
     */
    private int maxSpeed;
    /**
     * Current speed of the car
     */
    private int speed;
    /**
     * Status of the car
     */
    private Status status;
    /**
     * Tank capacity of the car
     */
    private int tankCapacity;
    /**
     * Gasoline type of the car
     */
    private Gasoline gasoline;

    /**
     * Constructor of the class Car
     * @param brand of the car
     * @param color of the car
     * @param maxSpeed of the car
     * @param price of the car
     * @param tankCapacity of the car
     * @param gasoline type of the car
     * @throws Exception if the gasoline is not a valid type of gasoline
     */
    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, int tankCapacity, Gasoline gasoline) throws Exception {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.tankCapacity = tankCapacity;
        // Test if the gasoline is a valid type of gasoline with a try-catch
        try {
            if (gasoline != Gasoline.OCTANE_95 && gasoline != Gasoline.OCTANE_98 && gasoline != Gasoline.GASOLEO_A) {
                throw new Exception("Incorrect type of fuel");
            }
            else {
                this.gasoline = gasoline;
            }
        } catch (Exception e) {
            throw new Exception("Incorrect type of fuel");
        }
    }

    /**
     * Constructor of the class Car
     * @param price of the car
     */
    public Car(BigDecimal price) {
        super(price);
    }

    //todo

    /**
     * Turns on the car
     */
    public void on() {
        this.status = ON;
    }

    //todo
    /**
     * Turns off the car
     */
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //todo
    /**
     * Method to set the speed of the car. If the speed is negative, it throws an exception
     * @param speed of the car
     * @throws Exception if the speed is negative
     */
    public void setSpeed(int speed) throws Exception {
        if (speed <= 0) {
            throw new Exception("Speed can't be negative");
        } else {
            this.speed = speed;
        }
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception {
        //todo Create method to fill car
        if (liters < 0) {
            throw new Exception("Liters can't be negative");
        }
        if (liters > this.tankCapacity) {
            throw new Exception("Liters exceed tank capacity");
        }
        if (gasoline != this.gasoline) {
            throw new Exception("Incorrect type of fuel");
        }

    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     * @throws Exception if the speed is negative
     */
    public void startDriving (int speed, int time) throws Exception {
        // todo Create method to start driving
        // the method setSpeed() already throws an exception if the speed is negative
        setSpeed(speed);
        on(); // Turn on the car
    }

    /**
     * Cleans the car
     */
    @Override
    public void clean() {
        System.out.println("Coche limpiándose");
    }

    /**
     * Gets the brand of the car
     * @return brand of the car
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Sets the brand of the car
     * @param brand of the car
     */
    public void setBrand(Brand brand) {
        this.brand = brand;
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
     * Gets the maximum speed of the car
     * @return maximum speed of the car
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento

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

    /**
     * Gets the current speed of the car
     * @return current speed of the car
     */
    public int getSpeed() {
        return speed;
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
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Gets the price of the car
     * @return price of the car
     */
    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
