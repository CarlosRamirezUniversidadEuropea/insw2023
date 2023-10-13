package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.CarBrand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPPED;

/**
 * Representa un coche
 * @author Pablo Ribas Borrego
*/
public class Car extends Vehicle implements Cleanable {

    private CarBrand brand;
    private Status status;
    private Gasoline gasoline;
    private int capacity;
    private int liters;

    /**
     * Constructor de la clase Car
     * @param brand Marca del coche
     * @param color Color del coche
     * @param maxSpeed Velocidad máxima del coche
     * @param price Precio del coche
     * @param gasoline Tipo de gasolina
     * @param capacity Capacidad del depósito
     */
    public Car(BigDecimal price, int maxSpeed, Color color, CarBrand brand, Gasoline gasoline, int capacity) {
        super(price, maxSpeed, color, 0);
        setBrand(brand);
        this.status = STOPPED;
        setGasoline(gasoline);
        setCapacity(capacity);
        this.liters = 0;
    }

    public Car(BigDecimal price, int maxSpeed, Color color, int speed) {
        super(price, maxSpeed, color, speed);
    }

    // Enciende el coche
    public void on() {
        if (liters == 0) {
            throw new IllegalArgumentException("El depósito está vacío.");
        } else {
            this.status = ON;
            System.out.println("El coche está encendido. Brrrrrr...");
        }
    }

    // Para el coche
    public void stop() {
        setSpeed(0);
        this.status = STOPPED;
        System.out.println("El coche se ha parado.");
    }

    /**
     * Llena el depósito de combustible
     * @param gasoline Tipo de gasolina
     * @param liters Cantidad de litros a llenar
     */
    public void fillCombustible(Gasoline gasoline, int liters) {
        if (liters < 0) {
            throw new IllegalArgumentException("Los litros no pueden ser negativos.");
        } else if (this.gasoline != gasoline) {
            throw new IllegalArgumentException("El tipo de gasolina no es válido.");
        } else if (this.liters + liters > capacity) {
            throw new IllegalArgumentException("Los litros no pueden exceder la capacidad del depósito.");
        } else {
            this.liters = (this.liters + liters);
            System.out.println("El depósito se ha llenado con " + liters + " litros de " + gasoline + ". Ahora hay " + this.liters + " litros en el depósito.");
        }
    }

    @Override
    public void Drive(int speed, int time) {
        if (time < 0) {
            throw new IllegalArgumentException("El tiempo no puede ser negativo.");
        } else if (liters == 0) {
            throw new IllegalArgumentException("El depósito está vacío.");
        } else if (speed > getMaxSpeed()) {
            throw new IllegalArgumentException("La velocidad no puede ser mayor a la máxima.");
        } else {
            setSpeed(speed);
            on();
            System.out.println("El coche ha acelerado a " + speed + " km/h en " + time + " segundos.");
        }
    }

    @Override
    public void clean() {
        System.out.println("FWSHHH! El coche se ha limpiado.");
    }

    public CarBrand getBrand() {
        return brand;
    }

    // Si la marca no es de las especificadas en el enumerate, lanza una excepción
    public void setBrand(CarBrand brand) {
        if (brand != CarBrand.RENAULT && brand != CarBrand.PEUGEOT && brand != CarBrand.FORD && brand != CarBrand.TOYOTA && brand != CarBrand.MERCEDES && brand != CarBrand.TESLA && brand != CarBrand.KIA && brand != CarBrand.PORSCHE && brand != CarBrand.LAMBORGHINI && brand != CarBrand.FERRARI && brand != CarBrand.ROLLS_ROYCE && brand != CarBrand.LEXUS && brand != CarBrand.SEAT && brand != CarBrand.SUBARU && brand != CarBrand.BMW && brand != CarBrand.HONDA && brand != CarBrand.AUDI && brand != CarBrand.MAZDA && brand != CarBrand.MINI) {
            throw new IllegalArgumentException("La marca no es válida.");
        } else {
            this.brand = brand;
        }
    }

    public Status getStatus() {
        return status;
    }

    // Si el estado no es ON o STOPPED, lanza una excepción
    public void setStatus(Status status) {
        if (status != ON && status != STOPPED) {
            throw new IllegalArgumentException("El estado no es válido.");
        } else {
            this.status = status;
        }
    }

    public Gasoline getGasoline() {
        return gasoline;
    }

    // Si el tipo de gasolina no es válido, lanza una excepción
    public void setGasoline(Gasoline gasoline) {
        if (gasoline != Gasoline.OCTANE_95 && gasoline != Gasoline.OCTANE_98 && gasoline != Gasoline.GASOLEO_A) {
            throw new IllegalArgumentException("El tipo de gasolina no es válido.");
        } else {
            this.gasoline = gasoline;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    // Si la capacidad del depósito es negativa, lanza una excepción
    public void setCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("La capacidad del depósito no puede ser negativa.");
        } else {
            this.capacity = capacity;
        }
    }

    public int getLiters() {
        return liters;
    }

    // Si los litros en el coche son negativos o exceden la capacidad, lanza una excepción
    public void setLiters(int liters) {
        if (liters < 0) {
            throw new IllegalArgumentException("La capacidad del depósito no puede ser negativa.");
        } else if (liters > capacity) {
            throw new IllegalArgumentException("Los litros no pueden exceder la capacidad del depósito.");
        } else {
            this.liters = liters;
        }
    }

    @Override
    public String toString() {
        return "Coche de la marca " + brand + " con un precio de " + getPrice() + " euros, de color " + getColor() + ", con una velocidad máxima de " + getMaxSpeed() +
                " y un depósito de " + capacity + " litros llenos al " + liters/capacity + "% con " + gasoline + ".\n" +
                "Se encuentra " + status + " a una velocidad de " + getSpeed() + "km/h.";
    }
}
