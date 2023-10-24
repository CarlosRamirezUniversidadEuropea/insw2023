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
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {

    /**
     * Constructor del camion
     * @param brand Marca del camion
     * @param color Color del camion
     * @param maxSpeed Maxima velocidad del camion
     * @param price Precio del camion
     * @param gasoline Tipo de gasolina del camion
     * @param tankCapacity // Capadidad del deposito del camion
     */
    public Truck(BigDecimal price, Brand brand, Color color, int maxSpeed, Gasoline gasoline, double tankCapacity) {
        super(price, brand, color, maxSpeed, gasoline, tankCapacity);
    }


    @Override
    public String toString() {
        return "Camion{" +
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
        System.out.println("Camion limpiándose");
    }
}
