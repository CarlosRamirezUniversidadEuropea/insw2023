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
     * Metodo que calcula el area
     * @return Devuelve el area del rectangulo
     */
    @Override
    public double calculateArea() {
        area = lado*altura;
        return area;
    }

    /**
     * Metodo que convierte en string todos los atributos de Rectangulo
     * @return Un string de los atributos del rectangulo
     */
    @Override
    public String toString() {
        return "El area del rectángulo es: "+calculateArea() + ", El perimetro del rectangulo es : "+calculatePerimeter();
    }
}
