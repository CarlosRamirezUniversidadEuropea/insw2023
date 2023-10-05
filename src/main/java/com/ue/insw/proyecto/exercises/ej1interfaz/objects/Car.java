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
     * Gasoline type of the car
     */
    private Gasoline gasoline;
    /**
     * Tank capacity of the car
     */
    private int tankCapacity;

    /**
     * Constructor of the class Car
     * @param brand of the car
     * @param gasoline type of the car
     * @param color of the car
     * @param maxSpeed of the car
     * @param price of the car
     * @param tankCapacity of the car
     * @throws Exception if the gasoline is not a valid type of gasoline
     */
    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, int tankCapacity, Gasoline gasoline) throws Exception {
        super(color, price, maxSpeed);
        this.setTankCapacity(tankCapacity);
        this.setBrand(brand);
        this.setGasoline(gasoline);
    }

    /**
     * Method toString of the class Car
     * @return the information of the car
     */
    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", gasoline=" + gasoline +
                ", color=" + getColor() +
                ", maxSpeed=" + getMaxSpeed() +
                ", speed=" + getSpeed() +
                ", status=" + getStatus() +
                ", tankCapacity=" + getTankCapacity() +
                ", price=" + getPrice() +
                '}';
    }

    /**
     * Method to fill the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception {
        //todo Create method to fill car
        if (liters <= 0) {
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
        super.setSpeed(speed);
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
    public void setBrand(Brand brand) throws Exception {
        //throw an exception if the brand is not a valid brand: RENAULT, PEUGEOT, FORD, TOYOTA, MERCEDES, TESLA
        try {
            if (brand != Brand.RENAULT && brand != Brand.PEUGEOT && brand != Brand.FORD && brand != Brand.TOYOTA && brand != Brand.MERCEDES && brand != Brand.TESLA) {
                throw new Exception("Incorrect brand");
            } else {
                this.brand = brand;
            }
        } catch (Exception e) {
            throw new Exception("Incorrect brand");
        }
    }


    /**
     * Gets the tank capacity of the car
     * @return tank capacity of the car
     */
    public int getTankCapacity() {
        return tankCapacity;
    }

    /**
     * Sets the tank capacity of the car. If the tank capacity is negative, it throws an exception
     * @param tankCapacity of the car
     * @throws Exception if the tank capacity is negative
     */
    public void setTankCapacity(int tankCapacity) throws Exception {
        if (tankCapacity <= 0) {
            throw new Exception("Tank capacity can't be negative");
        } else {
            this.tankCapacity = tankCapacity;
        }
    }

    /**
     * Gets the gasoline type of the car
     * @return gasoline type of the car
     */
    public Gasoline getGasoline() {
        return gasoline;
    }

    /**
     * Sets the gasoline type of the car. If the gasoline type is not a valid type of gasoline, it throws an exception
     * @param gasoline type of the car
     */
    public void setGasoline(Gasoline gasoline) throws Exception {
        try {
            if (gasoline != Gasoline.OCTANE_95 && gasoline != Gasoline.OCTANE_98 && gasoline != Gasoline.GASOLEO_A) {
                throw new Exception("Incorrect type of fuel");
            } else {
                this.gasoline = gasoline;
            }
        } catch (Exception e) {
            throw new Exception("Incorrect type of fuel");
        }

    }


}
