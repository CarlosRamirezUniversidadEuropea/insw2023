package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

public class Vehicle {

    private BigDecimal price;
    private int speed;

    public Vehicle(BigDecimal price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public int getSpeed() {
        return speed;
    }
}