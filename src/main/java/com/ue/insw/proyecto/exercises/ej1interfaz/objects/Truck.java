package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline.*;


//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable {

    private Gasoline gasoline;

    private int depMaximo;

    private int deposito;
    Status status;

    int maxSpeed;
    public Truck(BigDecimal price, Gasoline gasoline,int depMaximo,int deposito,Status status, int maxSpeed) {
        super(price);
        this.gasoline = gasoline;
        this.depMaximo = depMaximo;
        this.deposito = deposito;
        this.status = status;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void clean() {
        System.out.println("camion limpiandose");
    }
    public void setSpeed(int speed) {
    }

    public void fillCombustible(Gasoline gasoline, int liters) throws Exception{
        //todo Create method to fill car
        if(this.gasoline == gasoline){
            if(this.deposito == this.depMaximo){
                throw new Exception ("el deposito esta lleno");
            }
            else{
                if(liters <= 0){
                    throw new Exception("el numero de litros debe ser positivo");
                }
                if(liters > depMaximo){
                    throw new Exception("El numero de litros supera el deposito");
                }
                else{
                    deposito += liters;
                    System.out.println("gasolina en el deposito" + deposito);
                }
            }
        }
        else {
            throw new Exception("gasolina incompatible");
        }
    }
    public void startDriving (int speed) {
        // todo Create method to start driving
        if(speed > 0 && speed < maxSpeed){
            if(deposito > 0){
                this.status = ON;
                System.out.println("velocidad: " + speed);
                setSpeed(speed);
            }
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "gasoline=" + gasoline +
                ", depMaximo=" + depMaximo +
                ", deposito=" + deposito +
                ", status=" + status +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
