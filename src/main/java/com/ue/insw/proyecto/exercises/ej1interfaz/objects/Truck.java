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
public class Truck extends Vehicle implements Cleanable {
    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    private int capacidadDeposito;
    private Gasoline gas;
    private int litrosGasolina;

    public Truck(BigDecimal price, Brand brand, Color color, int maxSpeed, int capacidadDeposito, Gasoline gas) {
        super(price);
        this.brand = brand;
        this.gas = gas;
        this.speed = 0;
        this.color = color;
        this.status = Status.STOPED;
        this.capacidadDeposito = capacidadDeposito;
        this.maxSpeed = maxSpeed;
        this.litrosGasolina = 0;
    }

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

    public void setMaxSpeed(int maxSpeed) throws Exception {
        if(maxSpeed <= 0){
            throw new Exception("La velocidad no puede ser menor o igual a 0");
        }
        else{
            this.maxSpeed = maxSpeed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public Gasoline getGas() {
        return gas;
    }

    public void setGas(Gasoline gas) {
        this.gas = gas;
    }

    public int getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(int litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    @Override
    public void clean() {
        System.out.println("Camion limpio");
    }
    public void startDriving (int speed, int time) throws Exception {
        // todo Create method to start driving
        if (status == ON){
            if(speed > maxSpeed){
                throw new Exception("La velocidad no puede exceder la maxima del coche");
            }
            else{
                setSpeed(speed);
                System.out.println("Conduciendo a " + speed + " km/h ,durante " + time + " s" );
            }
        }
        else{
            throw new Exception("El coche debe de encenderse antes de empezar a conducirse");
        }
    }

    public void fillCombustible(Gasoline gasoline, int liters) throws Exception{
        //todo Create method to fill car
        if(liters > 0){
            if(liters > capacidadDeposito){
                throw new Exception("Los litros no pueden exceder la capacidad del deposito");
            }
            else{
                if (gasoline == gas){
                    if ((litrosGasolina + liters) > capacidadDeposito){
                        throw new Exception("El tanque ya esta parcialmente lleno, con esta cantidad rebosaría");
                    }
                    else{
                        litrosGasolina = litrosGasolina + liters;
                    }
                }
                else{
                    throw  new Exception("El tipo de gasolina tiene que ser el especifico del vehiculo");
                }
            }
        }
        else{
            throw new Exception("Los litros no pueden ser negativos o iguales a 0");
        }
    }
    public String toString(){
        return "Truck{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                ", capacidadDeposito=" + capacidadDeposito +
                ", gas =" + gas +
                ", litrosGasolina=" + litrosGasolina +
                '}';
    }
    public void on(){
        this.status = ON;
    }
    public void stop(){
        this.status = Status.STOPED;
    }
}
