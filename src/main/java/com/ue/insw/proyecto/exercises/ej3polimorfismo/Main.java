package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}
