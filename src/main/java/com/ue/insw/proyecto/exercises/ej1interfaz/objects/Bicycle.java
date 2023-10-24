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
public class Bicycle extends Vehicle implements Cleanable {
    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    private int capacidad;

    public Bicycle(Brand brand, Color color, BigDecimal price, int speed,int capacidad){
        super(price, speed);
        this.brand=brand;
        this.color=color;
        this.status=STOPED;
        this.speed=speed;
        this.capacidad=capacidad;


    }
    public Bicycle(BigDecimal price, int speed) {
        super(price, speed);
    }
    public void InflarRuedas( int aire) {

        if(aire<0){
            throw new IllegalArgumentException(" El aire  no pueden ser negativos ");
        }

        if (aire>capacidad){
            throw new IllegalArgumentException("La cantidad de aire no pude superar a la capacidad de aire de las ruedas ");
        }
        System.out.println(" EL coche a sido llenado con una cantidad de: " +aire+ "aire");

        //todo Create method to fill car
    }
    public void startPedaleando (int speed, int time) {

        if(speed<0 || time<0){
            throw new IllegalArgumentException(" No se puede tener ni velocidad ni tiempo negativos ");
        }
        // todo Create method to start driving
        this.status=ON;
        this.speed=speed;

        System.out.println( "Su vehiculo se a puesto en marcha s una velocidad de " +speed+ "KM/h" );
    }
    public void setMaxSpeedBicycle(int maxSpeed) {
        if(maxSpeed<=0) {
            throw new IllegalArgumentException(" Los valocidad no puede ser negativa o cero ");
        }
        this.maxSpeed = maxSpeed;
        System.out.println("la velocidad maxima es: "+maxSpeed);

    }

    @Override
    public void clean() {
        System.out.println(" Bici limpia ");
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
    @Override
    public String toString(){
        return "Bicicleta{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}
