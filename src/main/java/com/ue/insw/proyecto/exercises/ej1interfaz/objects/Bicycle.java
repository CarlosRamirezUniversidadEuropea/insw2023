package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;




import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends  Vehicle implements Cleanable {

    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Bicycle(Brand brand,Color color, int maxSpeed, BigDecimal price){
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = STOPED;
    }
    public Bicycle(BigDecimal price) {super(price); }

    //TODO
    public void on(){
        this.status = ON;
    }

    //TODO
    public void stop() {
        this.speed = 0;
        this.status = STOPED;
    }
    //TODO
    public int getSpeed() {
        return speed;
    }
    //TODO
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * fills the car with gasoline
     * @param gasoline type of gas
     * @param liters number of liters
     */
    public void fillCombustibl(Gasoline gasoline, int liters) {

    }
    public void startDriving (int speed, int time) {

    }
    @Override
    public void clean() {System.out.println("bici limpioandose");}

    public Brand getBrand() {return brand; }
    public void setBrand(Brand brand) {this.brand = brand; }
    public Color getColor() {return color; }
    public void setColor(Color color) {this.color = color; }
    public int getCMaxSpeed() {return maxSpeed; }

    //la velocidad tiene que estar en numero positivo, encapsulamiento, modificar metodo

    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed; }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Status getStatus() {return status; }
    public void setStatus(Status status) {this.status = status; }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand=" + brand +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }

}
