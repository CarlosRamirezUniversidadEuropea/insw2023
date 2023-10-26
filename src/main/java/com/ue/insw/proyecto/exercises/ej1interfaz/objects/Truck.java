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
public class Truck extends Vehicle implements Cleanable {
    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private int litters;
    private Gasoline gas;
    private Status status;
    public Truck(Brand brand, Color color, int maxSpeed, BigDecimal price){
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }
    @Override
    public void clean(){
        System.out.println("Camión limpiándose");
    }
    public void on(){
        this.status = ON;
    }
    public void stop(){
        this.status = STOPED;
        this.speed = 0;
    }
    public void fillCombustile(Gasoline gasoline,int liters){
        System.out.println("Se han introducido "+liters+" litros del combustible "+gasoline);
    }
    public void startDriving (int speed, int time) {
        System.out.println("Hace "+time+"segundos que se inció la marcha con una velocidad de "+speed);
    }
    public String toString(){
        return "Truck{ "+
                "Brand: "+brand+
                ", Color: "+color+
                ", MaxSpeed: "+maxSpeed+
                ", Speed: "+speed+
                ", Status: "+status+"}";
    }
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed <=0){
            System.out.println("Velocidad incorrecta");
        }else{
            this.maxSpeed = maxSpeed;
        }
    }
    public Brand getBrand(){
        return brand;
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
    public void setStatus(Status s){
        this.status = s;
    }
}
