package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;
import java.math.BigDecimal;


import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;


    public Bicycle(BigDecimal price, Color color, int maxSpeed, int speed) {
        super(price);
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
        this.status = STOPED;
    }

    public void on() {
        this.status = ON;

    }

    //todo
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Bicycle(BigDecimal price) {
        super(price);
    }

    //todo
    public void setSpeed(int speed) {
        this.speed = speed;
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
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void startDriving(int speed) {
        if (speed > 0) {
            setStatus(status.ON);
            setSpeed(speed);
        }

    }

    public String toString() {

        return "Bicicleta{" + " color=" + color + ", maxSpeed=" + maxSpeed + ", speed=" + speed + ", status=" + status + '}';
    }

    public void clean() {
        System.out.println("Se esta limpiando la bici");
    }
}




