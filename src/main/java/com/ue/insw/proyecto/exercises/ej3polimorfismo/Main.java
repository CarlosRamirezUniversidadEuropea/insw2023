package com.ue.insw.proyecto.exercises.ej3polimorfismo;


public class Main {

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.calculatePerimeter();
        c.calculateArea();
        r.calculateArea();
        r.calculatePerimeter();
        c.toString();
        r.toString();

        //TODO crear circulo y rectangulo y calcular su area y perímetro

    }
}
