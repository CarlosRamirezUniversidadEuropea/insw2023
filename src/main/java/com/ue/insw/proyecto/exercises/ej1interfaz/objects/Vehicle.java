package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

public class Vehicle {

    private BigDecimal price;
    private int speed;
    private int maxSpeed;

    public Vehicle(BigDecimal price, int maxSpeed) {
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public int getSpeed(){
        return speed;
    }
}
