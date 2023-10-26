package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculatePerimeter() {
        return (length*2)+(width*2);
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "El alto del rectangulo es = " + length + ", y su ancho = " + width + " .";
    }
}
