package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {
    private double lado1;
    private double lado2;

    public Rectangle(double l1,double l2){
        this.lado1 = l1;
        this.lado2 = l2;
    }

    @Override
    public double calculatePerimeter() {

        return ((2*lado1) + (2*lado2));
    }

    @Override
    public double calculateArea() {
        return (lado1 * lado2);
    }

    @Override
    public String toString() {
        System.out.println("El area del rectangulo es:");
        System.out.println(calculateArea());
        System.out.println("El perimetro del rectangulo es:");
        System.out.println(calculatePerimeter());
        return null;
    }
}
