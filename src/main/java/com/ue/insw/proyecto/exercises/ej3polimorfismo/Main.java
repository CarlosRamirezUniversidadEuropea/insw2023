package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
    }
}
