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

    private Gasoline gs;

    private int capacidad = 50;

    private int litros_actuales;

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.litros_actuales =0;
        this.status = STOPED;
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
        if(maxSpeed>0){
            this.maxSpeed = maxSpeed;
        }else{
            System.out.println("La velocidad no puede ser negativa");
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

    public void fillCombustible(Gasoline gs, int litros) throws Exception{
        System.out.println("Se esta llenando el déposito");
        if (capacidad<litros){
           throw new Exception("ERROR: La gasolina excede la capacidad ");
        }
        else{
            litros_actuales = litros;
            System.out.println("Deposito llenado correctamente");
            capacidad = capacidad - litros;
        }
    }

    public void startDriving(int speed){
        if (speed>0){
            setStatus(status.ON);
            setSpeed(speed);
        }
    }
    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", color=" + color + ", maxSpeed=" + maxSpeed + ", speed=" + speed + ", status=" + status + '}';
    }
}
