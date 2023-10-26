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

    private Brand brand; // Marca del coche
    private Color color; // Color del coche
    private int maxSpeed; // Velocidad máxima del coche
    private int speed; // Velocidad actual del coche
    private Status status; // Estado del coche (encendido o apagado)

    private Gasoline gasolineType; // Tipo de gasolina que utiliza el coche

    // Constructor que recibe múltiples parámetros para inicializar las propiedades
    public Car(Brand brand, Color color, int maxSpeed, int speed, BigDecimal price, Gasoline gasolineType, int fuelCapacity, Status status) {
        super(price, fuelCapacity);

        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 10; // La velocidad inicial se establece en 10 km/h que es mas o menos el punto de friccion de el embrague
        this.status = ON; // El coche se inicia como encendido
        this.gasolineType = gasolineType;
    }



    // Método para encender el coche
    public void on() {
        if (status == ON) {
            throw new IllegalStateException("El coche ya está encendido."); // Excepción si el coche ya está encendido
        }
        this.status = ON;
    }

    // Método para detener el coche
    public void stop() {
        if (status == STOPED) {
            throw new IllegalStateException("El coche ya está detenido."); // Excepción si el coche ya está apagado
        }
        this.speed = 0; // Si la velocidad es 0, el coche está parado
        this.status = STOPED;
    }

    // Método para establecer la velocidad del coche
    public void setSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa.");
        }
        this.speed = speed;
    }

    // Método para llenar el tanque de combustible del coche
    public void fillCombustible(Gasoline gasoline, int liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("La cantidad de litros debe ser mayor que cero.");
        }
        // Implementa el llenado de combustible aquí
        if (gasoline != gasolineType) {
            throw new IllegalArgumentException("Solo se puede llenar con el mismo tipo de combustible que el especificado en el constructor.");
        }

        if (super.getFuelLevel() + liters > super.getFuelCapacity()) {
            throw new IllegalArgumentException("La cantidad de litros supera la capacidad del depósito.");
        }

        super.setFuelLevel(super.getFuelLevel() + liters);
    }

    // Método para iniciar la conducción del coche
    public void startDriving(int speed, int time) {
        if (speed < 0 || time < 0) {
            throw new IllegalArgumentException("La velocidad y el tiempo deben ser valores positivos.");
        }
        // Implementa el inicio de la conducción aquí
        if (status == ON) {
            throw new IllegalArgumentException("El coche ya está encendido.");
        }
        this.status = ON;
        this.speed = speed;
    }

    // Método de la interfaz Cleanable para limpiar el coche
    @Override
    public void clean() {
        System.out.println("Coche limpiándose");
    }

    // Métodos getter y setter para las propiedades del coche

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
        return "Car{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                ", gasoline type: " + gasolineType +
                '}';
    }
}
