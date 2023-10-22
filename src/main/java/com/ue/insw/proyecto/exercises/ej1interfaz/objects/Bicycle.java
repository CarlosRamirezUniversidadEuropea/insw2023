package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;

    public Bicycle(BigDecimal price, Brand brand, Color color) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = 280; //Record actual de velocidad en bicicleta de una persona.
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

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void startDriving(int speed, int time) throws Exception {
        if(speed > maxSpeed){
            throw new Exception("La velocidad no puede ser mayor a 280");
        }
        else{
            System.out.println("Conduciendo a " + speed + ", durante " + time + " s");
            setSpeed(speed);
        }
    }
    @Override
    public void clean() {
        System.out.println("Bicicleta limpia");
    }
    public String toString(){
        return "Bicycle = [" +
                "color= " + color +
                ", brand= " + brand +
                ", speed= " + speed +
                ", maxSpeed= " + maxSpeed +
                ", price= " + getPrice() +
                "]";
    }

}
