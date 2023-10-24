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
    private Status status;
    private Gasoline gasolina;
    private int capacidad;



    public Truck(Brand brand, Color color, BigDecimal price,Gasoline gasolina,int capacidad, int speed) {
        super(price,speed);
        this.brand = brand;
        this.color = color;
        this.speed=speed;
        this.status = STOPED;
        this.gasolina=gasolina;
        this.capacidad=capacidad;
    }
    public Truck(BigDecimal price, int speed) {
        super(price, speed);
    }

    @Override
    public void clean() {
        System.out.println("Camion limpio ");
    }
    public void ArrancarCamion (int speed, int time) {

        if(speed<0 || time<0){
            throw new IllegalArgumentException(" No se puede tener ni velocidad ni tiempo negativos ");
        }
        // todo Create method to start driving
        this.status=ON;
        this.speed=speed;

        System.out.println( "Su camion se a puesto en marcha s una velocidad de " +speed+ "KM/H " );
    }
    public void LLenarCamion(Gasoline gasoline, int liters) {

        if(liters<0){
            throw new IllegalArgumentException(" Los litros no pueden ser negativos ");
        }
        if(gasoline != gasolina){
            throw new IllegalArgumentException("No se puede agregar este tipo e gasolina a este coche ");
        }
        if (liters>capacidad){
            throw new IllegalArgumentException("La cantidad de litros no pude superar a la capacidad de litros del coche ");
        }
        System.out.println(" EL coche a sido llenado con una cantidad de: " +liters+ "litros");

        //todo Create method to fill car
    }
    public void setMaxSpeedCamion(int maxSpeed) {
        if(maxSpeed<=0) {
            throw new IllegalArgumentException(" La velocidad no puede ser negativa o cero ");
        }
        this.maxSpeed = maxSpeed;
        System.out.println("la velocidad maxima es: "+maxSpeed);

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
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Gasoline getGasolina() {
        return gasolina;
    }

    public void setGasolina(Gasoline gasolina) {
        this.gasolina = gasolina;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    @Override
    public  String toString(){
        return "Camion{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
