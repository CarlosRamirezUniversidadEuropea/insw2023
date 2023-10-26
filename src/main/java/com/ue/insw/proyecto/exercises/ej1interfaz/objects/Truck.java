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

//como la clase truck era igual que la clase car porque un coche es un camion pequeño le pedi al la ia que me cambiase car por truck
public class Truck extends Vehicle implements Cleanable {

    private Brand brand; // Marca del camión
    private Color color; // Color del camión
    private int maxSpeed; // Velocidad máxima del camión
    private int speed; // Velocidad actual del camión
    private Status status; // Estado del camión (encendido o apagado)

    private Gasoline gasolineType; // Tipo de gasolina que utiliza el camión

    // Constructor que recibe múltiples parámetros para inicializar las propiedades
    public Truck(Brand brand, Color color, int maxSpeed, int speed, BigDecimal price, Gasoline gasolineType, int fuelCapacity, Status status) {
        super(price, fuelCapacity);

        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 10; // La velocidad inicial se establece en 10 km/h
        this.status = ON; // El camión se inicia como encendido
        this.gasolineType = gasolineType;
    }


    // Método para encender el camión
    public void on() {
        if (status == ON) {
            throw new IllegalStateException("El camión ya está encendido."); // Excepción si el camión ya está encendido
        }
        this.status = ON;
    }

    // Método para detener el camión
    public void stop() {
        if (status == STOPED) {
            throw new IllegalStateException("El camión ya está detenido."); // Excepción si el camión ya está apagado
        }
        this.speed = 0; // Si la velocidad es 0, el camión está parado
        this.status = STOPED;
    }

    // Método para establecer la velocidad del camión
    public void setSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa.");
        }
        this.speed = speed;
    }

    // Método para llenar el tanque de combustible del camión
    public void fillCombustible(Gasoline gasoline, int liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("La cantidad de litros debe ser mayor que cero.");
        }
        // Implementa el llenado de combustible aquí
        if (gasoline != gasolineType) {
            throw new IllegalArgumentException("Solo se puede llenar con el mismo tipo de combustible que se puede si no el motor se rompe.");
        }

        if (super.getFuelLevel() + liters > super.getFuelCapacity()) {
            throw new IllegalArgumentException("La cantidad de litros supera la capacidad del depósito.");
        }

        super.setFuelLevel(super.getFuelLevel() + liters);
    }

    // Método para iniciar la conducción del camión
    public void startDriving(int speed, int time) {
        if (speed < 0 || time < 0) {
            throw new IllegalArgumentException("La velocidad y el tiempo deben ser valores positivos.");
        }
        // Implementa el inicio de la conducción aquí
        if (status == ON) {
            throw new IllegalArgumentException("El camión ya está encendido.");
        }
        this.status = ON;
        this.speed = speed;
    }

    // Método de la interfaz Cleanable para limpiar el camión
    @Override
    public void clean() {
        System.out.println("Camión limpiándose");
    }

    // Métodos getter y setter para las propiedades del camión

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
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
            throw new IllegalArgumentException("La velocidad máxima no puede ser negativa.");
        }
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

    @Override
    public String toString() {
        return "Truck{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                ", gasoline type: " + gasolineType +
                '}';
    }
}
