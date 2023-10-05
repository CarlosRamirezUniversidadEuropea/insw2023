package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
    public class Circle extends Shape {
    double radio;
    double pi;

    public Circle(){
    }

    public Circle(double radio, double pi){
        this.radio = radio;
        this.pi = pi;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculatePerimeter() {
        double perimetro = 2 * pi * radio;
        return perimetro;
    }

    @Override
    public double calculateArea() {
        double area = pi * radio * radio;
        return area;
    }

    @Override
    public String toString() {
            return "Circulo [El perimetro es = " + calculatePerimeter() +
                    "] [El area es = "  + calculateArea() + "]";
    }
}
