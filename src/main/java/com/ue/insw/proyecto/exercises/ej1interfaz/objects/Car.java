package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline.*;
//todo extender de Vehicle
//todo implementar Cleanable
public class Car extends Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    Gasoline gasoline;
    private int deposito;
    private int depMaximo;

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price,Gasoline gasoline,int depMaximo,int deposito) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.gasoline = gasoline;
        this.deposito = deposito;
        this.depMaximo = depMaximo;
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
        //todo Create method to fill car
        if(this.gasoline == gasoline){
            if(this.deposito == this.depMaximo){
                throw new Exception ("el deposito esta lleno");
            }
            else{
                if(liters <= 0){
                    throw new Exception("el numero debe ser positivo");
                }
                if(liters > depMaximo){
                    throw new Exception("El numero de litros supera el deposito");
                }
                else{
                    deposito += liters;
                    System.out.println("cantidad en el deposito: " + deposito);
                }
            }
        }
        else {
            throw new Exception("gasolina incompatible");
        }
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     *
     */
    public void startDriving (int speed) {
        // todo Create method to start driving
        if(speed > 0 && speed < maxSpeed){
            if(deposito > 0){
                this.status = ON;
                System.out.println("velocidad: " + speed);
                setSpeed(speed);
            }
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

    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) throws Exception{
        this.maxSpeed = maxSpeed;
        if(maxSpeed < 0){
            throw new Exception("la velocidad debe ser positiva");
        }
        else{
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
                '}';
    }
}
