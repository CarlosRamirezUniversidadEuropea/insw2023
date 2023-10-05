package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
        Circle circle = new Circle(5.0);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.toString();
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(3.5,4.0);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println(rectangle.toString());
    }
}
