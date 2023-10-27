package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    private Status status;

    public Bicycle(BigDecimal price,Status status) {
        super(price);
        this.status = status;

    }

    @Override
    public void clean() {
        System.out.println("bicicleta limpiandose");
    }
    public void setSpeed(int speed) {
    }
    public void startDriving (int speed) {
        // todo Create method to start driving
        if (speed > 0) {
            this.status = ON;
            System.out.println("velocidad: " + speed);
            setSpeed(speed);
        }

    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "status=" + status +
                '}';
    }
}
