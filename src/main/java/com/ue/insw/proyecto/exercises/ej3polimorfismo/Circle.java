package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {return 2 * Math.PI * radius; }

    public double calculateArea() {return Math.PI * radius * radius; }

    @Override
    public String toString() {return "Circle with radius " + radius; }
}
