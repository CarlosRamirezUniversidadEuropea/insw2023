package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

public class Vehicle {

    private BigDecimal price;
    private int speed;
    private int fuelCapacity;
    private int fuelLevel;


    public Vehicle(BigDecimal price , int fuelCapacity) {
        this.price = price;
        this.fuelCapacity = fuelCapacity;
    }
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public BigDecimal getPrice(){
        return price;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }
}
