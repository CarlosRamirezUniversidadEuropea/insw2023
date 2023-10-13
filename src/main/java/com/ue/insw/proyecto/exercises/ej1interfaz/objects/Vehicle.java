package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;

/**
 * Representa un vehículo
 * @author Pablo Ribas Borrego
 */
public class Vehicle {

    private BigDecimal price;
    private int maxSpeed;
    private int speed;
    private Color color;

    public Vehicle(BigDecimal price, int maxSpeed, Color color, int speed) {
        setPrice(price);
        setMaxSpeed(maxSpeed);
        setColor(color);
        setSpeed(speed);
    }

    public void Drive(int speed, int time) {
        if (time < 0) {
            throw new IllegalArgumentException("El tiempo no puede ser negativo.");
        } else {
            setSpeed(speed);
            System.out.println("El vehículo ha acelerado a " + speed + " km/h en " + time + " segundos.");
        }
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setPrice(BigDecimal price){
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        } else {
            this.price = price;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color != Color.BLACK && color != Color.WHITE && color != Color.LIGHT_GREY && color != Color.RED && color != Color.BLUE && color != Color.YELLOW && color != Color.PURPLE && color != Color.GREEN && color != Color.MULTICOLORED) {
            throw new IllegalArgumentException("El color no es válido.");
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa.");
        } else if (maxSpeed > 1080000000) {
            throw new IllegalArgumentException("La velocidad no puede ser mayor que la velocidad de la luz.");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > maxSpeed) {
            throw new IllegalArgumentException("La velocidad no puede ser mayor a la máxima.");
        } else if (speed < 0) {
            throw new IllegalArgumentException("La velocidad no puede ser negativa.");
        } else {
            this.speed = speed;
            System.out.println("El vehículo ha acelerado a " + speed + " km/h.");
        }
    }

}
