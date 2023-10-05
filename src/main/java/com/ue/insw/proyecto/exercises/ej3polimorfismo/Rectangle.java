package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {
    private double base;
    private double altura;

    public double calculatePerimeter(double base, double altura) {
        double perimetro = base*2 + altura*2;
        return perimetro;
    }


    public double calculateArea(double base, double altura) {
        double area = base*altura;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
