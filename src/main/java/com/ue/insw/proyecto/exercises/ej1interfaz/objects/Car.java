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
    private Status status; // Determina si el coche esta en "on" o "off"
    private Gasoline gasoline; // Tipo de gasolina del coche
    private double tankCapacity; // Capacidad del deposito

    /**
     * Constructor de Car
     * @param brand Marca del coche
     * @param color Color del coche
     * @param maxSpeed Velocidad maxima del coche
     * @param price Precio del coche
     */
    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, Gasoline gasoline, double tankCapacity) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.gasoline = gasoline;
        this.tankCapacity = tankCapacity;
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
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception{
        if(this.gasoline.equals(gasoline) && tankCapacity >= liters && liters>0){
            System.out.println("Se ha llenado el coche con " + liters + " litros de " + gasoline);
        }else{
            throw new Exception("La gasolina seleccionada no es la correcta o se ha superado el limite del deposito");
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive (Km/h)
     * @param time in seconds
     */
    public void startDriving (int speed, int time) throws Exception{
        if(speed >= 0 && time > 0){
            status = ON;
            this.speed = speed;
            System.out.println("Se ha empezado a conducir a " + speed + " Km/h ");
        }else{
            throw new Exception("La velocidad o el tiempo no pueden ser negativos");
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

    public void setMaxSpeed(int maxSpeed) throws Exception {
        if(maxSpeed < 0){
            throw new Exception("La velocidad no puede ser negativa");
        }else{
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
                ", gasoline=" + gasoline +
                ", tankCapacity=" + tankCapacity +
                '}';
    }
}
