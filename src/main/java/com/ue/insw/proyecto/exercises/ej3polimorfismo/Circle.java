package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{
    double radio;

    public Circle(double r){
        this.radio = r;
    }


    @Override
    public double calculatePerimeter() {
        return (2 * 3.14 * radio);
    }

    @Override
    public double calculateArea() {
        return (3.14 * radio * radio);
    }

    @Override
    public String toString() {
        System.out.println("El area del circulo es:");
        System.out.println(calculateArea());
        System.out.println("El perimetro del circulo es:");
        System.out.println(calculatePerimeter());
        return null;
    }
}
