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

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }

    public Car(BigDecimal price) {
        super(price);
    }

    //todo
    public void on() {
        this.status = ON;
    }

    //todo
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //todo
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */

    public void fillCombustible(Gasoline gasoline, int liters, int capacity) throws Exception {
        if (liters <= 0) {
            throw new IllegalArgumentException("Los litros deben ser un número positivo.");
        }

        if (gasoline != Gasoline.OCTANE_95 && gasoline != Gasoline.OCTANE_98 && gasoline != Gasoline.GASOLEO_A) {
            throw new IllegalArgumentException("No se puede llenar con un tipo de combustible diferente.");
        }

        if (liters > capacity) {
            throw new IllegalArgumentException("La cantidad de combustible no puede superar la capacidad del depósito.");
        }

        // Implementar la lógica para llenar el combustible
        // this.capacity -= liters;
    }
    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving(int speed, int time) throws Exception {
        if (speed < 0) {
            throw new IllegalArgumentException("La velocidad debe ser un número positivo.");
        }
    }

        @Override
    public void clean() {
        System.out.println("Coche limpiándose");
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) {
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
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Car[" +
                " Marca: " + brand +
                ", color: " + color +
                ", maxima velocidad: " + maxSpeed +
                ", velocidad: " + speed +
                ", estado: " + status +
                ']';
    }
}
