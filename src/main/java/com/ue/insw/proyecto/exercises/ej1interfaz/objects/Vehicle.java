package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

public class Vehicle {

    /**
     * Price of the vehicle
     */
    private BigDecimal price;
    /**
     * Maximum speed of the vehicle
     */
    private int speed;

    /**
     * Constructor of the class Vehicle
     * @param price
     */
    public Vehicle(BigDecimal price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public BigDecimal getPrice(){
        return price;
    }
}
