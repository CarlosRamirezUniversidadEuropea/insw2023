package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{
    private double base;
    private double altura;
    public  Rectangle(double b, double a){
        this.base = b;
        this.altura = a;
    }
    @Override
    public double calculateArea (){
        double area = base*altura;
        return area;
    }
    @Override
    public double calculatePerimeter(){
        double perimetro = 2*base + 2*altura;
        return perimetro;
    }
    @Override
    public String toString(){
        return "El area del rectangulo es: "+calculateArea()+"\n"+
                "El perimetro del rectangulo es: "+calculatePerimeter();
    }
}
