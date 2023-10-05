package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {
    private double radio;
    private double pi= 3.14;

    public Circle (double radio, String color){
        super(color);
        this.radio = radio;
    }

    @Override
    public double calculateArea(){
        double area = pi*radio*radio;

        return area ;
    }

    @Override
    public double calculatePerimeter(){

        double perimetro = 2 * pi * radio;
        return perimetro;

    }
    public String toString(){

        return "El área del circulo es: " + calculateArea()+ "y el perímetro es: "+ calculatePerimeter();
    }

}

