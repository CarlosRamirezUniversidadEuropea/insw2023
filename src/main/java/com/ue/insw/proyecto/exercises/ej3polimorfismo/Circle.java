package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{
    private double radio;
    private double perimetro;
    private double area;

    public Circle(double radio, double perimetro, double area){
        this.radio = radio;
        this.perimetro = perimetro;
        this.area = area;
    }

    public double calculatePerimeter(){
        perimetro = radio*2*Math.PI;
        return perimetro;
    }


    public double calculateArea() {
        area = radio*radio*Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Perimetro: " + perimetro + " " + "Area: " + area;
    }
}
