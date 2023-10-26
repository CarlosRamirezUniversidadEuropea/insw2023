package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implementar Cleanable
public class Car extends Vehicle implements Cleanable {

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, Gasoline gas, int deposit) {
        super(price, 0, gas, STOPED, brand, color, maxSpeed, deposit);
    }

    @Override
    public void clean() {
        System.out.println("Coche limpiándose");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + super.getBrand() +
                ", color=" + super.getColor() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", speed=" + super.getSpeed() +
                ", status=" + super.getStatus() +
                '}';
    }
}
