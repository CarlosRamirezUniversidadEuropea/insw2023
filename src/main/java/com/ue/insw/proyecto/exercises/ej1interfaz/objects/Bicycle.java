package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    public Bicycle(BigDecimal price, int speed, Gasoline gas, Status stat, Brand brand, Color color, int maxSpeed, int deposit) {
        super(price, speed, gas, stat, brand, color, maxSpeed, deposit);
    }
    public void startDriving (int speed, int time) throws Exception{
        if (speed < 0){
            throw new RuntimeException("La velocidad no puede ser negativa");
        }else {
            super.setSpeed(speed);
            super.setStatus(ON);
        }
    }

    @Override
    public void clean() {
        System.out.println("Tractor limpiándose");
    }
    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) throws Exception {
        if (maxSpeed >= 0) {
            throw new RuntimeException("La velocidad no puede ser negativa");
        } else {
            super.setMaxSpeed(maxSpeed);
        }
    }

    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "bicicleta{" +
                "brand=" + super.getBrand() +
                ", color=" + super.getColor() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", speed=" + super.getSpeed() +
                ", status=" + super.getStatus() +
                '}';
    }
}
