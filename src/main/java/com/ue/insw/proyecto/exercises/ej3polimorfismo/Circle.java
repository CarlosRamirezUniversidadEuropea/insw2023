package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {
    private double radio;

    public Circle(){
        radio = 0.0;
    }
    //metodos

    public double calculatePerimeter(double radio) {
        double p = radio*2*Math.PI;
        return p;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }


    public double calculateArea(double radio) {
        double area = radio*radio*Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return null;
    }
}
