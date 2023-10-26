package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println(circle.toString());
        System.out.println("Área del círculo: " + circle.calculateArea());
        System.out.println("Perímetro del círculo: " + circle.calculatePerimeter());
        System.out.println("---------------------------------------------");

        System.out.println(rectangle.toString());
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());
        System.out.println("Perímetro del rectángulo: " + rectangle.calculatePerimeter());

    }
}
