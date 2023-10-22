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

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, Gasoline gas, int deposit) {
        super(price, 0, gas, STOPED, brand, color, maxSpeed, deposit);
    }

    //todo
    public void on() {
        super.setStatus(ON);
    }

    //todo
    public void stop() {
        super.setSpeed(0);
        super.setStatus(STOPED);
    }

    //todo
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception{
        if (super.getGasoline() != gasoline){
            throw new RuntimeException("El conbustible introducido no es correcto");
        } else if (liters >= super.getDeposit()){
            throw new RuntimeException("No puedes añadir mas litros de los que caben en el deposito");
        } else if (liters <= 0) {
            throw new RuntimeException("No puedes añadir litros en negativo");
        } else {
            System.out.println("Se estan anhadiendo " +liters +" litros de "+gasoline +"al deposito de " +super.getDeposit() +" litros");
        }

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
            super.setSpeed(speed);
            super.setStatus(ON);
        }
    }

    @Override
    public void clean() {
        System.out.println("Coche limpiándose");
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
        return "Car{" +
                "brand=" + super.getBrand() +
                ", color=" + super.getColor() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", speed=" + super.getSpeed() +
                ", status=" + super.getStatus() +
                '}';
    }
}
