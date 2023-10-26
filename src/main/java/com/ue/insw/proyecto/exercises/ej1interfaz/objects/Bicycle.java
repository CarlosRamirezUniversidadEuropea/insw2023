package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;

//todo extender de Vehicle
//todo implements Cleanable
//el codigo es el mismo que de car o truck pero tengo en cuenta que no tiene gaslonia
public class Bicycle extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Bicycle(Brand brand, Color color, int maxSpeed, int speed, BigDecimal price, int fuelCapacity, Status status) {
        super(price, 0);//no tiene fuelCapacity

        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 2;
        this.status = status;
    }



    public void startRiding(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa.");
        }
        this.speed = speed;
    }

    public void stop() {
        this.speed = 0; // Si la velocidad es 0, la bicicleta está detenida
    }

    // Método  limpiar la bicicleta
    @Override
    public void clean() {
        System.out.println("Bicicleta limpiándose");
    }

    // Métodos getter y setter

    public Brand getBrand() {
        return brand;// marca
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;//color
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            throw new IllegalArgumentException("La velocidad máxima no puede ser negativa.");
        }
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
