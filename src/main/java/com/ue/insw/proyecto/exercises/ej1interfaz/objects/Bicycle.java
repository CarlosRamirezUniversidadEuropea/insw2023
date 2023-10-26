package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;
import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {

    private Color color;
    private int speed;
    private String type;

    public Bicycle(Color color, int speed, String type, BigDecimal price) {
        super(price);
        this.color = color;
        this.speed = speed;
        this.type = type;
    }

    @Override
    public void clean() {
        System.out.println("Bicicleta limpiándose");
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
        return "Bicicleta[" +
                "Color: " + color +
                ", velocidad: " + speed +
                ", tipo: " + type +
                "]" ;
    }
}