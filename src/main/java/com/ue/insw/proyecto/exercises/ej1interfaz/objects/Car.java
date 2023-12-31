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

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
    private Gasoline gasoline;
    private int deposito;
    private int depMaximo;

    public Car(Brand brand, Color color, int maxSpeed, BigDecimal price, Gasoline gasoline,int depMaximo) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
        this.gasoline = gasoline;
        this.depMaximo = depMaximo;
    }

    //todo
    public void on() {
        this.status = ON;
    }

    //todo
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }

    //todo
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustible(Gasoline gasoline, int liters) throws Exception {
        validarGasolina(gasoline);
        comprobarDeposito();
        validarLitrosNegativos(liters);
        validarLitrosDeposito(liters);

        this.deposito += liters;
        System.out.println("Se han ingresado los litros en el deposito");
    }

    private void validarGasolina(Gasoline gasoline) throws Exception {
        if (this.gasoline != gasoline) {
            throw new Exception("No coincide el tipo de gasolina");
        }
    }

    private void comprobarDeposito() throws Exception {
        if (this.deposito == this.depMaximo) {
            throw new Exception("El deposito esta lleno");
        }
    }

    private void validarLitrosNegativos(int liters) throws Exception {
        if (liters <= 0) {
            throw new Exception("Los litros no son válidos");
        }
    }
    private void validarLitrosDeposito(int liters) throws Exception {
        if (liters > depMaximo) {
            throw new Exception("Los litros no son válidos");
        }
    }
    /**
     * Starts driving the car
     * @param speed desired to drive
     *
     */
    private void validarVelocidadMaxima(int speed) throws Exception {
        if ( speed > maxSpeed) {
            throw new Exception("No puede superar la velocidad maxima");
        }
    }
    private void validarVelocidadNegativa(int speed) throws Exception {
        if ( speed > maxSpeed) {
            throw new Exception("No puede superar la velocidad maxima");
        }
    }
    public void startDriving (int speed) throws Exception {
        // todo Create method to start driving
        validarVelocidadMaxima(speed);
        validarVelocidadNegativa(speed);
        if(deposito > 0){
            this.status = ON;
            setSpeed(speed);
        }
    }

    @Override
    public void clean() {
        System.out.println("Coche limpiándose");
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

    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
    public void setMaxSpeed(int maxSpeed) throws Exception {
        if(maxSpeed < 0 ){
            throw new Exception("La velocidad no puede ser negativa");
        } else {this.maxSpeed = maxSpeed;}
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
                ", gasoline=" + gasoline +
                ", deposito maximo=" + depMaximo +
                '}';
    }
}
