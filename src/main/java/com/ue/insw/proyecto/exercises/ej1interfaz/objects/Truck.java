package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {
    public Truck(BigDecimal price, Gasoline gas, Brand brand, Color color, int maxSpeed, int deposit) {
        super(price, 0, gas, STOPED, brand, color, maxSpeed, deposit);
    }


    @Override
    public void clean() {
        System.out.println("Tractor limpiándose");
    }



    @Override
    public String toString() {
        return "Tractor{" +
                "brand=" + super.getBrand() +
                ", color=" + super.getColor() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", speed=" + super.getSpeed() +
                ", status=" + super.getStatus() +
                '}';
    }
}
