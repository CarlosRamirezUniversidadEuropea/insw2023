package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape{
    private double radio, pi=3.14159, area, perimetro;

    /**
     * Constructor
     * @param r Radio del circulo
     */

    Circle(double r){
        this.radio = r;
    }

    /**
     * Metodo que calcula el perimetro del circulo
     * @return El perimetro del circulo
     */
    @Override
    public double calculatePerimeter() {
        perimetro = 2*pi*radio;
        return perimetro;
    }

    /**
     * Metodo que calcula el area
     * @return El area del circulo
     */

    @Override
    public double calculateArea() {
        area = pi*radio*radio;
        return area;
    }

    /**
     * Metodo que convierte en string todos los atributos de Circulo
     * @return Un string de los atributos del Circulo
     */
    @Override
    public String toString() {
        return "El area del circulo es: "+calculateArea() +", El perimetro del circulo es:"+calculatePerimeter();
    }
}
