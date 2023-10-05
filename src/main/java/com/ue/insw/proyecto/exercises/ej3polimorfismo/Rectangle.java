package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {
    private double base;
    private double altura;

    public Rectangle(double base,double altura,String color){
    super(color);
    this.base = base;
    this.altura =altura;

    }

    @Override
    public double calculateArea(){
        double area= base*altura;
        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimetro = (2*base) + (2*altura);
        return perimetro;
    }

    public String toString(){

        return "El área del rectangulo es: "+ calculateArea()+" y el perímetro es: "+ calculatePerimeter();
    }
}
