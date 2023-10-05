package com.ue.insw.proyecto.exercises.ej3polimorfismo;


import java.util.Scanner;

//todo extends shape
public class Circle extends Shape{

    double pi = 3.14;
    double radio=2;
    double perimetro, area;

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calculatePerimeter() {
        perimetro = 2*pi*radio;

        return perimetro;
    }

    @Override
    public double calculateArea() {
        area = pi * (radio*radio);
        return area;
    }

    @Override
    public String toString() {
        System.out.println("El perimetro del circulo es: " + perimetro);
        System.out.println("El area del circulo es: " + area);
        return null;
    }
}
