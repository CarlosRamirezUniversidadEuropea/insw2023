package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{
    private double radio;
    public Circle(double radio){
        this.radio = radio;
    }
    @Override
    public double calculatePerimeter() {
        return getRadio() * 2 * 3.1416;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return (radio * radio) * 3.1416;
    }

    @Override
    public String toString() {
        String aux = "Circle = [radio = " + radio + "area:" + calculateArea() + " perimetro " + calculatePerimeter()+ "]";
        return aux ;
    }
}
