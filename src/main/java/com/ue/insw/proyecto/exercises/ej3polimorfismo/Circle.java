package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{
    private double radio, pi=3.14159, area, perimetro;

    Circle(double r){
        this.radio = r;
    }
    @Override
    public double calculatePerimeter() {
        perimetro = 2*pi*radio;
        return perimetro;
    }

    @Override
    public double calculateArea() {
        area = pi*radio*radio;
        return area;
    }

    @Override
    public String toString() {
        return "El area del circulo es: "+calculateArea() +", El perimetro del circulo es:"+calculatePerimeter();
    }
}
