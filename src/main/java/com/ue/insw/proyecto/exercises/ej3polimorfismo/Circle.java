package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle {
    private double radio;
    private double pi=3.14;

    public Circle(double r){
        this.radio = r;

    }
    public double calculateArea(){
        double area = radio * pi * pi;

        return area;
    }
    public double calculatePerimeter(){
        double perimetro = radio * pi * 2;

        return perimetro;
    }
    public String toString(){
        return "el area es: " + calculateArea() + "el perimetro es: " + calculatePerimeter();
    }
}
