package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;
import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    private int speed;
    private String type;

    public Bicycle(BigDecimal price, int speed, String type) {
        super(price);
        this.speed = speed;
        this.type = type;
    }

    //todo Implementar la lógica para la bicicleta
    // Implementar los métodos de la interfaz Cleanable
    @Override
    public void clean() {
        System.out.println("Bicicleta limpiándose");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}