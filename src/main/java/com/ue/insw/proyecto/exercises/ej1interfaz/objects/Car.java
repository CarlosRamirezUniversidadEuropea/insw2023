package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPPED;

//todo extender de Vehicle
//todo implementar Cleanable
public class Car extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    private int tankCurrCapacity;
    private int tankMaxCapacity;
    private Gasoline gasoline;

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, Gasoline gasoline, int tankMaxCapacity) throws Exception{
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPPED;
        this.tankCurrCapacity = tankMaxCapacity;
        this.tankMaxCapacity = tankMaxCapacity;
        // check if the gasoline is a valid one from the enum
        if (gasoline != Gasoline.OCTANE_95 && gasoline != Gasoline.OCTANE_98 && gasoline != Gasoline.GASOLEO_A) {
            throw new Exception("El tipo de gasolina no es válido");
        }
        else {
            this.gasoline = gasoline;
        }
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
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception{
        //todo if the gasoline is not the same as the car, throw an exception
        if (this.gasoline != gasoline) {
            throw new Exception("El tipo de gasolina no es el mismo");
        }

        //check for a positive number of liters
        if (liters < 0) {
            throw new Exception("El número de litros no puede ser negativo");
        }

        //todo if the tank is full, throw an exception
        if (this.tankCurrCapacity + liters > this.tankMaxCapacity) {
            throw new Exception("El tanque está lleno");
        }
        else {
            this.tankCurrCapacity += liters;
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) {
        // set status to on
        on();

        // set speed to the desired speed, 
        // if it is higher than the max speed, set it to the max speed
        // if it is lower than 0, set it to 0
        if (speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
        else if (speed < 0) {
            this.speed = 0;
        }
        else {
            this.speed = speed;
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

    public void setMaxSpeed(int maxSpeed) throws Exception{
        if (maxSpeed < 0) {
            throw new Exception("La velocidad no puede ser negativa");
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
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
