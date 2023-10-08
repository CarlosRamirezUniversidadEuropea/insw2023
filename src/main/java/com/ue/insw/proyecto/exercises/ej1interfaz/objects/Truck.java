package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable{

    /**
     * Cargo capacity of the truck
     */
    private double cargoCapacity;

    /**
     * Constructor for Truck
     * @param color of the truck
     * @param maxSpeed of the truck
     * @param price of the truck
     */
    public Truck(Color color, int maxSpeed, BigDecimal price, double cargoCapacity) throws Exception {
        super(color, price, maxSpeed);
        this.setCargoCapacity(cargoCapacity);
    }

    /**
     * Constructor for Truck
     * @param price of the truck
     */
    public Truck(BigDecimal price) {
        super(price);
    }

    /**
     * Method to get the cargo capacity of the truck
     */
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * Method to set the cargo capacity of the truck. It must be greater than 0
     */
    public void setCargoCapacity(double cargoCapacity) throws Exception {
        if (cargoCapacity > 0) {
            this.cargoCapacity = cargoCapacity;
        } else {
            throw new Exception("The cargo capacity must be greater than 0");
        }

    }

    /**
     * Method to clean the truck
     */
    @Override
    public void clean() {
        System.out.println("Cleaning truck");
    }

    /**
     * Method toString of the class Truck
     */
    @Override
    public String toString() {
        return "Truck{" +
                "color=" + getColor() +
                ", speed=" + getSpeed() +
                ", status=" + getStatus() +
                ", price=" + getPrice() +
                ", cargoCapacity=" + getCargoCapacity() +
                '}';
    }
}
