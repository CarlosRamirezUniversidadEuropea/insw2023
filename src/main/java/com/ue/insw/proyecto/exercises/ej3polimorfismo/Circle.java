package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {
    private double radio;
    private double pi = 3.14;
    public Circle(double r){
        this.radio = r;
    }
    @Override
    public double calculateArea(){
        double area = pi*radio*radio;
        return area;
    }
    @Override
    public double calculatePerimeter(){
        double perimetro = 2*pi*radio;
        return perimetro;
    }
    @Override
    public String toString(){
        return "El area del circulo es: "+calculateArea()+ "\n"+
                "El perimetro del circulo es: "+calculatePerimeter();
    }
}
