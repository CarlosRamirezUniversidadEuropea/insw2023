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

    /**
     * Constructor de Car
     * @param brand Marca del coche
     * @param color Color del coche
     * @param maxSpeed Velocidad maxima del coche
     * @param price Precio del coche
     */
    public Car(BigDecimal price, Brand brand, Color color, int maxSpeed, Gasoline gasoline, double tankCapacity) {
        super(price, brand, color, maxSpeed, gasoline, tankCapacity);
    }


    @Override
    public String toString() {
        return "Car{" +
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
        System.out.println("Coche limpiándose");
    }
}