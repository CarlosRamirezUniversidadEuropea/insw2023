package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    public Bicycle(Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }
    public void on(){
        this.status = ON;
    }
    public void stop(Status s){
        this.status = STOPED;
        this.speed = 0;
    }
    public void startDriving (int speed, int time) {
        System.out.println("Hace "+time+"segundos que se inció la marcha con una velocidad de "+speed);
    }
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed <=0){
            System.out.println("Velocidad incorrecta");
        }else{
            this.maxSpeed = maxSpeed;
        }
    }
    @Override
    public void clean(){
        System.out.println("Bicicleta limpiándose");
    }
    public String toString(){
        return "Truck{ "+
                " Color: "+color+
                ", MaxSpeed: "+maxSpeed+
                ", Speed: "+speed+
                ", Status: "+status+"}";

    }
    public Color getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }
}
