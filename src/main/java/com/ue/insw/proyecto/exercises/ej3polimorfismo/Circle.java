package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{
    private double radio;
    public Circle(double radio){
        this.radio = radio;
    }
    @Override
    public double calculatePerimeter() {
        this.perimetro = radio * 2 * 3.1416;
        return perimetro;
    }

    @Override
    public double calculateArea() {
        this.area = (radio * radio) * 3.1416;
        return area;
    }

    @Override
    public String toString() {
        String aux = "Circle = [radio = " + radio + ", area = " + area + ", perimetro = " + perimetro + "]";
        return aux ;
    }
}
