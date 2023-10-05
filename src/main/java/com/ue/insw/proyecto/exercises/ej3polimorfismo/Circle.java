package com.ue.insw.proyecto.exercises.ej3polimorfismo;

import com.ue.insw.proyecto.Constants;

import static com.ue.insw.proyecto.Constants.pi;

//todo extends shape
public class Circle extends Shape {
    private double radio;

    public Circle( double radio) {

        this.radio = radio;
    }

    public double getradio() {
        return radio;
    }

    public void setradio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculatePerimeter() {
        double resperimetro = 0;
        resperimetro = 2 * (pi) * radio;
        return resperimetro;

    }

    @Override
    public double calculateArea() {
        double resarea = 0;
        resarea = pi * (radio * radio);

        return resarea;
    }

    @Override
    public String toString() {
        return null;
    }
}
