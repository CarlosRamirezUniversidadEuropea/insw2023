package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle {
    private int base;
    private int altura;
    public Rectangle(int b, int h){
        this.base = b;
        this.altura = h;
    }
    public double calculateArea(){
        double area = base * altura;

        return area;
    }
    public double calculatePerimeter(){
        double perimetro = (base * 2) + (altura * 2);

        return perimetro;
    }
    public String toString(){
        return "el area es: " + calculateArea() + "el perimetro es: " + calculatePerimeter();
    }
}
