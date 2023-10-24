package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {

    public Bicycle(BigDecimal price, Brand brand, Color color, int maxSpeed) {
        super(price, brand, color, maxSpeed, Gasoline.NON, 0);
    }


    @Override
    public String toString() {
        return "Bici{" +
                "brand=" + getBrand() +
                ", color=" + getColor() +
                ", maxSpeed=" + getMaxSpeed() +
                ", speed=" + getSpeed() +
                ", status=" + getStatus() +
                ", gasoline=" + getGasoline() +
                ", tankCapacity=" + getTankCapacity() +
                '}';
    }

    @Override
    public void clean() {
        System.out.println("Bici limpiándose");
    }
}
