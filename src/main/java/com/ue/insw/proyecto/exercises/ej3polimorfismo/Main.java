package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
        Circle c = new Circle(5,0,0);
        Rectangle r = new Rectangle(2,5,0,0);

        c.calculatePerimeter();
        c.calculateArea();
        System.out.println("CIRCULO: ");
        System.out.println(c.toString());

        r.calculatePerimeter();
        r.calculateArea();
        System.out.println("RECTANGULO: ");
        System.out.println(r.toString());

    }
}
