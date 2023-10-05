package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPPED;

/**
 * Representa un cpche
 * @author Pablo Ribas
*/
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
        this.status = STOPPED;
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
        this.status = STOPPED;
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
    public void fillCombustible(Gasoline gasoline, int liters) {
        //todo Create method to fill car
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) {
        if (speed > maxSpeed) {
            throw new IllegalArgumentException("La velocidad no puede ser mayor a la máxima.");
        } else if (speed < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa.");
        } else if (time < 0) {
            throw new IllegalArgumentException("El tiempo no puede ser negativo.");
        } else {
            this.speed = speed;
            this.status = ON;
            System.out.println("El coche está en marcha a " + speed + " km/h durante " + time + " segundos.");
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

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa.");
        } else if (maxSpeed > 1080000000) {
            throw new IllegalArgumentException("La velocidad no puede ser mayor que la velocidad de la luz.");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if (status != ON && status != STOPPED) {
            throw new IllegalArgumentException("El estado no es válido.");
        } else {
            this.status = status;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
