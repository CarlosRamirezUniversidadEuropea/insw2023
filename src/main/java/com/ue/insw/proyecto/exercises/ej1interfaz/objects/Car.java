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
    private Status status;
    private Gasoline gasolina;
    private int capacidad;



    public Car(Brand brand, Color color, BigDecimal price,Gasoline gasolina,int capacidad, int speed) {
        super(price,speed);
        this.brand = brand;
        this.color = color;
        this.speed=speed;
        this.status = STOPED;
        this.gasolina=gasolina;
        this.capacidad=capacidad;
    }

    public Car(BigDecimal price,int speed ) {
        super(price,speed);
    }

    //todo
    public void on() {
        this.status = ON;
    }

    //todo
    public void stop() {
        if(this.speed == 0) {
            this.status = STOPED;
        }
    }

    //todo
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if(capacidad<0){
            throw new IllegalArgumentException(" La capacidad no puede ser negativa ");
        }
        this.capacidad = capacidad;
    }


    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */

    public void fillCombustible(Gasoline gasoline, int liters) {

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

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) {

        if(speed<0 || time<0){
            throw new IllegalArgumentException(" No se puede tener ni velocidad ni tiempo negativos ");
        }
        // todo Create method to start driving
        this.status=ON;
        this.speed=speed;

        System.out.println( "Su vehiculo se a puesto en marcha s una velocidad de " +speed+ "KM/H " );
    }

    @Override
    public void clean() {
        System.out.println("Coche limpio ");
    }

    public Brand getBrand() {return brand;}

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

    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed<=0) {
            throw new IllegalArgumentException(" La velocidad no puede ser negativa o cero ");
        }
        this.maxSpeed = maxSpeed;
        System.out.println("la velocidad maxima es: "+maxSpeed);

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
