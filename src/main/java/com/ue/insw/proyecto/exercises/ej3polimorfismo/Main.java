package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
        Circle circle = new Circle(5);
        System.out.println("Area del circulo: " + circle.calcularArea());
        System.out.println("Perimetro del circulo: " + circle.calcularPerimetro());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area del rectangulo: " + rectangle.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangle.calcularPerimetro());


    }
}
