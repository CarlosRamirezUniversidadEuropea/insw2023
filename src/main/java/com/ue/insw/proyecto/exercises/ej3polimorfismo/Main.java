package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    double r;

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
        Circle circulo = new Circle();
        circulo.setRadio(4);
        circulo.calculateArea();
        circulo.calculatePerimeter();
        circulo.toString();

        Rectangle rec = new Rectangle();
        rec.setLadoG(4);
        rec.setLadoP(2);
        rec.calculatePerimeter();
        rec.calculateArea();
        rec.toString();
    }
}
