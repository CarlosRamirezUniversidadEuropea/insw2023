package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

public class Vehicle {

    private BigDecimal price;
    private int speed;
    private Brand brand;
    private Color color;
    private int maxSpeed, deposit;
    private Status status;
    private Gasoline gasoline;

    public Vehicle(BigDecimal price, int speed, Gasoline gas, Status stat, Brand brand, Color color, int maxSpeed, int deposit) {
        this.price = price;
        this.speed = speed;
        this.gasoline = gas;
        this.status = stat;
        this.brand= brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.deposit = deposit;
    }
    public void on() {
        this.status = ON;
    }
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Starts driving the car
     * @param speed desired to drive
     * @param time in seconds
     */
    public void startDriving (int speed, int time) throws Exception{
        if (speed < 0){
            throw new RuntimeException("La velocidad no puede ser negativa");
        }else {
            this.speed = speed;
            this.status = status;
        }
    }
    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception{
        if (this.gasoline != gasoline){
            throw new RuntimeException("El conbustible introducido no es correcto");
        } else if (liters >= this.getDeposit()){
            throw new RuntimeException("No puedes añadir mas litros de los que caben en el deposito");
        } else if (liters <= 0) {
            throw new RuntimeException("No puedes añadir litros en negativo");
        } else {
            System.out.println("Se estan anhadiendo " +liters +" litros de "+gasoline +"al deposito de " +this.gasoline +" litros");
        }

    }
    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) throws Exception {
        if (maxSpeed >= 0) {
            throw new RuntimeException("La velocidad no puede ser negativa");
        } else {
            this.maxSpeed=maxSpeed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public BigDecimal getPrice(){
        return price;
    }



    public Status getStatus() {
        return status;
    }

    public int getDeposit() {
        return deposit;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
