package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.TruckBrand;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

/** 
 * Representa un camión
 * @author Pablo Ribas Borrego
 */
public class Truck extends Vehicle implements Cleanable {

    private TruckBrand brand;
    private Status status;
    private Gasoline gasoline;
    private int capacity;
    private int liters;

    public Truck(BigDecimal price, int maxSpeed, Color color, int speed, TruckBrand brand, Gasoline gasoline, int capacity) {
        super(price, maxSpeed, color, speed);
        setBrand(brand);
        this.status = Status.STOPPED;
        setCapacity(capacity);
        setGasoline(gasoline);
        this.liters = 0;
    }

    public TruckBrand getBrand() {
        return brand;
    }

    public void setBrand(TruckBrand brand) {
        if (brand != TruckBrand.DAF && brand != TruckBrand.SCANIA && brand != TruckBrand.UD && brand != TruckBrand.RENAULT && brand != TruckBrand.PETERBILT && brand != TruckBrand.TATA && brand != TruckBrand.MERCEDES && brand != TruckBrand.FOTON && brand != TruckBrand.VOLVO) {
            throw new IllegalArgumentException("La marca no es válida.");
        } else {
            this.brand = brand;
        }
    }

    // Enciende el camión
    public void on() {
        if (liters == 0) {
            throw new IllegalArgumentException("El depósito está vacío.");
        } else {
            this.status = Status.ON;
            System.out.println("El camión está encendido. Brrrrrr...");
        }
    }

    // Para el camión
    public void stop() {
        setSpeed(0);
        this.status = Status.STOPPED;
        System.out.println("El camión se ha parado.");
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
            System.out.println("El camión ha acelerado a " + speed + " km/h en " + time + " segundos.");
        }
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if (status != Status.ON && status != Status.STOPPED) {
            throw new IllegalArgumentException("El estado no es válido.");
        } else {
            this.status = status;
        }
    }

    public Gasoline getGasoline() {
        return gasoline;
    }

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

    public void setCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("La capacidad no puede ser negativa.");
        } else {
            this.capacity = capacity;
        }
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        if (liters < 0) {
            throw new IllegalArgumentException("Los litros no pueden ser negativos.");
        } else if (liters > capacity) {
            throw new IllegalArgumentException("Los litros no pueden ser mayores que la capacidad.");
        } else {
            this.liters = liters;
        }
    }

    @Override
    public void clean() {
        System.out.println("FWSHHH! El camión se ha limpiado.");
    }

    @Override
    public String toString() {
        return "Camión de color " + getColor() + " con un precio de " + getPrice() + " euros y una velocidad máxima de " + getMaxSpeed() + "km/h."
                + "\nVelocidad actual: " + getSpeed() + "km/h.";
    }

}
