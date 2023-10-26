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
    private Gasoline gasolineType;
    private int liters;

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price,
               Gasoline gasolineType, int liters) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.gasolineType = gasolineType;
        this.liters = liters;
    }

    public Car(BigDecimal price) {
        super(price);
    }

    //todo
    public void on() {
        this.status = ON;
    }

    public Gasoline getGasolineType() {
        return this.gasolineType;
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
    public void fillCombustible(Gasoline gasoline, int liters,int capacity) {
        if (gasoline == getGasolineType()){
            if (liters < 0) {
                System.out.println("La cantidad de litros no puede ser negativa.");
            }
            if (liters == 0){
                System.out.println("No hay combustible en el camión ");
            }
            if (liters > capacity) {
                System.out.println("La cantidad de litros no puede superar la capacidad del depósito.");
            }
            if (this.liters + liters > capacity) {
                System.out.println("No se pueden agregar más litros que la capacidad del depósito.");
            }else{
                this.liters += liters;
                System.out.println("Se han añadido "+liters+" litros al deposito");
            }
        }
        if (gasoline != getGasolineType()) {
            System.out.println("El tipo de combustible no coincide con el del vehículo.");
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) {
        if (speed < 0) {
            System.out.println("La velocidad no puede ser negativa.");
        } else if(speed> maxSpeed){
            System.out.println("La velocidad no puede ser mayor a 120..");
        }else {
            System.out.println("El coche se esta moviendo");
        }
        this.setStatus(Status.ON);
        this.setSpeed(speed);
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

    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            System.out.println("La velocidad máxima no puede ser negativa.");
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
        return "Car {" +
                "brand = " + brand +
                ", color = " + color +
                ", maxSpeed = " + maxSpeed +
                ", speed = " + speed +
                ", status = " + status +
                ", gasolineType = " + gasolineType +
                ", liters = " + liters +
                '}';
    }
}
