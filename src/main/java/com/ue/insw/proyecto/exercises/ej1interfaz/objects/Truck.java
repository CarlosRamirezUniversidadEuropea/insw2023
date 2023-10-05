package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable{

    /**
     * Constructor for Truck
     * @param color of the truck
     * @param maxSpeed of the truck
     * @param price of the truck
     */
    public Truck(Color color, int maxSpeed, BigDecimal price) throws Exception {
        super(color, price, maxSpeed);
    }

    /**
     * Constructor for Truck
     * @param price of the truck
     */
    public Truck(BigDecimal price) {
        super(price);
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
                '}';
    }
}
