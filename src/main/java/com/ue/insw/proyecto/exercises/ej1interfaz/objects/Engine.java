package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;

public class Engine {
    
    private int power;
    private int maxPower;
    private Status status;

    public Engine(int maxPower) {
        this.maxPower = maxPower;
    }

    public void setPower(int power) throws Exception{
        if (power > maxPower) {
            throw new Exception("La potencia no puede ser mayor a la potencia máxima");
        }
        else {
            this.power = power;
        }
    }

    public int getPower() {
        return power;
    }

    public Status getStatus() {
        return status;
    }

    public void on() {
        System.out.println("Motor encendido");
        this.status = Status.ON;
    }

    public void off() {
        System.out.println("Motor apagado");
        this.status = Status.STOPPED;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", maxPower=" + maxPower +
                ", status=" + status +
                '}';
    }
}
