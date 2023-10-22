package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;

import java.math.BigDecimal;

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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public Gasoline getGasoline() {
        return gasoline;
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

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) throws Exception {
        this.maxSpeed = maxSpeed;
    }
}
