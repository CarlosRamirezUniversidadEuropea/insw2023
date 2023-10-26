package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Bic_Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;
import java.math.BigDecimal;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    private Bic_Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Bicycle (Bic_Brand brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }

    public Bicycle (BigDecimal price) {
        super(price);
    }

    public void on() {
        this.status = ON;
    }

    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    public Bic_Brand getBrand() {
        return brand;
    }

    public void setBrand(Bic_Brand brand) {
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
        if (maxSpeed < 0) {
            System.out.println("La velocidad máxima no puede ser negativa.");
        }
        this.maxSpeed = maxSpeed;
    }

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

    public void startDriving (int speed, int time){
        if (speed < 0) {
            System.out.println("La velocidad no puede ser negativa.");
        } else if(speed> maxSpeed){
            System.out.println("La velocidad no puede ser mayor a 30..");
        }else {
            System.out.println("La bicicleta se esta moviendo");
        }
        this.setStatus(Status.ON);
        this.setSpeed(speed);
    }

    @Override
    public String toString() {
        return "Bicycle {" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }

    @Override
    public void clean() {
        System.out.println("Bicicleta limpiándose");
    }


}
