package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {

    double lado1 = 5;
    double lado2 = 6.3;
    double perimetro;
    double area;
    @Override
    public double calculatePerimeter() {
        perimetro = lado1 * 2 + lado2 * 2;
        return perimetro;
    }

    @Override
    public double calculateArea() {
        area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString() {
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);
        return null;
    }
}
