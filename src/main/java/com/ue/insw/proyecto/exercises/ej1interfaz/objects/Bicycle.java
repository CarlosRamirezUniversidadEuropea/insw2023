package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
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
    public Bicycle(Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }
    public Bicycle(BigDecimal price) {
        super(price);
    }
    @Override
    public void clean() {
        System.out.println("Bicicleta limpiandose");
    }

    public void on() {
        this.status = ON;
    }
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }
    public void startDriving (int speed, int time) {
        if(speed > 0 && time < 0){
            System.out.println("Llevas "+ time + "conduciendo y has empezado a "+ speed + "km/h.");
        }else{
            System.out.println("No se ha empezado conducir.");

        }
    }
    public Color getColor() {
        return color;
    }

    public int getMaxSpeed() {
        if(maxSpeed < 0){
            System.out.println("Error de velocidad");
        }
        else{
            this.maxSpeed = maxSpeed;
        }
        return maxSpeed;
    }

    public String toString() {
        return "Bicycle{" +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed) {
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
}
