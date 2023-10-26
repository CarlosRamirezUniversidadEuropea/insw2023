package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int speed;
    private String type;

    public Truck ( Brand brand, Color color, int speed, String type, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.type = type;
    }

    @Override
    public void clean() {
            System.out.println("Truck limpiándose");
        }


    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Camion[" +
                "Marca: " + brand +
                ", color: " + color +
                ", velocidad: " + speed +
                ", tipo: " + type +
                "]" ;
    }
}

