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
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    private Brand brand;

    private int presionRuedas;

    private int presion_actual;

    public Bicycle(BigDecimal price, Color color, int maxSpeed, int speed, Brand brand, int presionRuedas, int presion_actual) {
        super(price);
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
        this.status = STOPED;
        this.brand= brand;
        this.presion_actual= presion_actual;
        this.presionRuedas= presionRuedas;
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

    //todo
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public Color getColor() {
        return color;
    }

    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed>0){
            this.maxSpeed = maxSpeed;
        }else{
            System.out.println("La velocidad no puede ser negativa");
        }
    }


    public void startDriving(int speed) {
        if (speed > 0) {
            setStatus(status.ON);
            setSpeed(speed);
        }

    }
    public void fillRuedas(int presionInrtoducida){
        System.out.println("Se estan hinchadon las ruedas");
        if (presion_actual+presionInrtoducida>presionRuedas){
            System.out.println("La presion excede la capacidad ");
        }
        else{
            presion_actual = presion_actual+presionInrtoducida;
            System.out.println("Ruedas hinchadas correctamente");
        }
    }

    public String toString() {

        return "Bicicleta{" + " color=" + color + ", maxSpeed=" + maxSpeed + ", speed=" + speed + ", status=" + status +  '}';
    }

    public void clean() {
        System.out.println("Se esta limpiando la bici");
    }
}




