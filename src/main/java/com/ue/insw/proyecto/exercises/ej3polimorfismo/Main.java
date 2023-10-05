package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
    Circle circle = new Circle(4,3.14);
        System.out.println("Informacion del circulo: ");
        System.out.println(circle.toString());
    Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Informacion del rectangulo: ");
        System.out.println(rectangle.toString());
    }
}
