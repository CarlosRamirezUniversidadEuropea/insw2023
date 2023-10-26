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
public class Bicycle extends Vehicle implements Cloneable {


    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Bicycle(Brand brand, Color color, int maxSpeed, BigDecimal price){
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }

    public  Bicycle(BigDecimal price){ super(price);}

    public void on() {this.status = ON;}

    public void stop(){
        this.speed = 0;
        this.status = STOPED;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Status getStatus() {
        return status;
    }

    public void clean() {
        System.out.println("Bici limpiándose");
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bicycle{"+
                ", brand=" + brand +
                ", color=" + color +
                ", speed=" + speed +
                ", status=" + status +
                "}";


    }
}
