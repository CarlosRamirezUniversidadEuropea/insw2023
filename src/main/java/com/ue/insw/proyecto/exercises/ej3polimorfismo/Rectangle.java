package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{
    double ladoG, ladoP;
    double perimetro, area;

    public void setLadoG(double ladoG) {
        this.ladoG = ladoG;
    }

    public void setLadoP(double ladoP) {
        this.ladoP = ladoP;
    }

    @Override
    public double calculatePerimeter() {
        perimetro = 2*ladoG+2*ladoP;
        return perimetro;
    }

    @Override
    public double calculateArea() {
        area = ladoG*ladoP;
        return 0;
    }

    @Override
    public String toString() {
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);
        return null;
    }
}
