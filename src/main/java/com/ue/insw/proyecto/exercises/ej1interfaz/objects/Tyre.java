package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

public class Tyre {
    
    private int pressure;
    private int maxPressure;

    public Tyre(int maxPressure) {
        this.maxPressure = maxPressure;
    }

    public void setPressure(int pressure) throws Exception{
        if (pressure > maxPressure) {
            throw new Exception("La presión no puede ser mayor a la presión máxima");
        }
        else if (pressure < 0) {
            throw new Exception("La presión no puede ser menor a 0");
        } else {
            this.pressure = pressure;
        }
    }

    public int getPressure() {
        return pressure;
    }

    public void deflate() {
        System.out.println("Desinflando neumático");
        this.pressure = 0;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "pressure=" + pressure +
                ", maxPressure=" + maxPressure +
                '}';
    }
}
