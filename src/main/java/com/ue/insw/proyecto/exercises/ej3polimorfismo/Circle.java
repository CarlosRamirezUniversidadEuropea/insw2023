package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{
    double radio;
    double area;
    double perimetro;
    final double pi = Math.PI;

    public Circle(double radio) {
        this.radio = radio;
        this.area = calculateArea();
        this.perimetro = calculatePerimeter();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radio;
    }

    @Override
    public double calculateArea() {
        return pi * radio * radio;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }

}
