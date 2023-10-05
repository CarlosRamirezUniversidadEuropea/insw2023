package com.ue.insw.proyecto.exercises.ej3polimorfismo;


//todo extends shape
public class Circle extends Shape{

    double radio = 3;
    double pi = 3.14;
    double perimetro;
    double area;

    @Override
    public double calculatePerimeter() {
        perimetro = 2 * pi * radio;
        return perimetro;
    }

    @Override
    public double calculateArea() {
        area = pi * (radio * radio);
        return area;
    }

    @Override
    public String toString() {
        System.out.println("El perimetro del circulo es: " + perimetro);
        System.out.println("El area del circulo es: " + area);
        return null;
    }
}
