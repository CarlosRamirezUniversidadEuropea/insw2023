package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
        Circle circle = new Circle(5);
        System.out.println(circle.calcularArea());
        System.out.println(circle.calcularPerimetro());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.calcularArea());
        System.out.println(rectangle.calcularPerimetro());


    }
}
