package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Bicycle(Brand brand, Color color, int maxSpeed, Double price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPPED;
    }

    public Bicycle(Double price) {
        super(price);
    }

    // todo
    public void stop() {
        this.speed = 0;
        this.status = STOPPED;
    }

    // todo
    public void setSpeed(int speed) throws Exception {
        this.speed = speed;
    }

    /**
     * Starts driving the car
     * 
     * @param speed desired to drive
     * @param time  in seconds
     */
    public void startRiding(int speed) {
        // todo Create method to start driving
        if (speed < 0 ) {
            throw new IllegalArgumentException("la velocidad debe ser positiva");
        } else {
            if (speed <= maxSpeed) {
                try {
                    setSpeed(speed);
                    this.status = ON;
                } catch (Exception e) {
                }
            } else {
                throw new IllegalArgumentException("La velocidad no puede ser mayor a la velocidad máxima");
            }
        }
    }

    @Override
    public void clean() {
        System.out.println("Bici limpiándose");
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

    // todo la velocidad tiene que ser un numero positivo, modificar método,
    // encapsulamiento
    public void setMaxSpeed(int maxSpeed) throws Exception {
        if (maxSpeed < 0) {
            throw new Exception("La velocidad debe ser positiva");
        }else{
            if (maxSpeed < this.speed) {
                this.speed = maxSpeed;
            }
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
