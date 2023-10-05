package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {
    private double lado1;
    private double lado2;

    public Rectangle(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calculatePerimeter() {
        this.perimetro = (lado1 * 2) + (lado2 * 2);
        return perimetro;
    }

    @Override
    public double calculateArea() {
        this.area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString() {
        String aux = "Rectangle = lado 1 = " + lado1 + " lado 2 = " + lado2 + " perimetro = " + perimetro + " area = " + area;
        return aux;
    }
}
