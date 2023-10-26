package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {
    private double radioR;

    public Rectangle(String color, double radioR) {
        super(color);
        this.radioR = radioR;
    }

    @Override
    public double calculatePerimeter() { //formual para calcular el perimetro
        return 2 * radioR; // Esta fórmula es para el perímetro de un rectángulo, no un círculo
    }

    @Override
    public double calculateArea() {
        //formual para calcular el area
        return radioR * radioR; // Esta fórmula es para el área de un rectángulo, no un círculo
    }

    @Override
    public String toString() {
        return "Rectangle [color=" + getColor() + ", radioR=" + radioR + "]";
    }
}
