package com.ue.insw.proyecto.exercises.ej3polimorfismo;


//todo extends shape
public class Rectangle extends Shape {
    private double lado, altura, perimetro, area;

    /**
     * Constructor
     * @param l lado del rectangulo
     * @param a altura del rectangulo
     */

    Rectangle(double l, double a){
        this.altura = a;
        this.lado = l;
    }

    /**
     * Metodo que calcula el perimetro
     * @return El perimetro del rectangulo
     */
    @Override
    public double calculatePerimeter() {
        perimetro = 2*lado + 2*altura;
        return perimetro;
    }

    /**
     * Metodo
     * @return
     */
    @Override
    public double calculateArea() {
        area = lado*altura;
        return area;
    }

    @Override
    public String toString() {
        return "El area del rectángulo es: "+calculateArea() + ", El perimetro del rectangulo es : "+calculatePerimeter();
    }
}
