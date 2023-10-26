package com.ue.insw.proyecto.exercises.ej1interfaz.objects;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;


public class Truck extends Vehicle implements Cleanable {
    
    private int speed;
    private static BigDecimal price;
    private int maxSpeed;

    public Truck(int maxSpeed) {
        super(price, maxSpeed);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void clean() {
        System.out.println("Camión limpio");
    }

    public void setSpeed(int speed) {
        if (speed > maxSpeed) {
            System.out.println("La velocidad no puede ser mayor a la velocidad máxima");
        }
        else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
