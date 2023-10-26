package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    public Bicycle(BigDecimal price, int speed, Gasoline gas, Status stat, Brand brand, Color color, int maxSpeed, int deposit) {
        super(price, speed, gas, stat, brand, color, maxSpeed, deposit);
    }

    public void fillCombustible (Gasoline gasoline, int liters){
        System.out.println("No puedes echarle combustible a una bici electrica");
    }

    @Override
    public void clean() {
        System.out.println("Tractor limpiándose");
    }



    @Override
    public String toString() {
        return "bicicleta{" +
                "brand=" + super.getBrand() +
                ", color=" + super.getColor() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", speed=" + super.getSpeed() +
                ", status=" + super.getStatus() +
                '}';
    }
}
