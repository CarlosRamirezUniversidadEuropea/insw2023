package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPPED;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline.*;


//todo extender de Vehicle
//todo implementar Cleanable
public class Car extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    Gasoline gasoline;
    int liters;
    int maxGasCapacity;

    public Car(Brand brand, Color color, int maxSpeed, Double price, Gasoline gasoline) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPPED;
        this.gasoline = gasoline;
    }

    public Car(Double price) {
        super(price);
    }

    // todo
    public void on() {
        this.status = ON;
    }

    // todo
    public void stop() {
        this.speed = 0;
        this.status = STOPPED;
    }

    // todo
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * 
     * @param gasoline type of gas
     * @param liters   number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception {
        // todo Create method to fill car
        if (gasoline == this.gasoline) {
            if (liters <= 0)
                throw new Exception("No se puede cargar esa cantidad de combustible");
            if (liters + this.liters <= this.maxGasCapacity) {
                this.liters += liters;
            } else {
                throw new Exception("No se puede cargar más combustible");
            }
        } else
            throw new Exception("No se puede cargar ese tipo de combustible");
    }

    /**
     * Starts driving the car
     * 
     * @param speed desired to drive
     * @param time  in seconds
     */
    public void startDriving(int speed,int time) throws Exception {
        // todo Create method to start driving
        if (speed > 0) {
            if (this.liters > 0) {
                if(speed > this.maxSpeed)
                    throw new Exception("La velocidad no puede ser mayor a la máxima");
                this.speed = speed;
                this.status = ON;

            } else {
                throw new Exception("No hay combustible");
            }
        } else {
            throw new Exception("La velocidad debe ser mayor a 0");
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
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else
            throw new IllegalArgumentException("La velocidad debe ser mayor a 0");
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
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
