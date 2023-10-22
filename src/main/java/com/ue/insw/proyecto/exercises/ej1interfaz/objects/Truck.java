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
    public Truck(BigDecimal price) {
        super(price);
    }


    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private int liters;
    private Gasoline gas;
    private Status status;

    public Truck (Brand brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }
    @Override
    public void clean() {

        System.out.println("Camion limpiandose");
    }

    public void on() {
        this.status = ON;
    }

    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }
    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) {
        System.out.println("Se ha repostado "+ liters + " de la gasolina "+ gasoline);
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) {
        // todo Create method to start driving
        if(speed > 0 && time < 0){
            System.out.println("Llevas "+ time + "conduciendo y has empezado a "+ speed + "km/h.");
        }else{
            System.out.println("No se ha empezado conducir.");

        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed < 0){
            System.out.println("Error de velocidad");
        }
        else {
            this.maxSpeed = maxSpeed;
        }
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMaxSpeed(int maxSpeed) {

        return maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public Status getStatus() {
        return status;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


}
