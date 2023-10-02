package com.ue.insw.proyecto.exercises.ej3polimorfismo;

/**
 * Esta clase contiene los atributos y metodos de un circulo
 * @author Pablo Ribas Borrego (AWDn0n)
 * @version 1.0
 * @see Shape
 */
public class Circle extends Shape {

    private double radius;

    /**
     * Constructor por defecto
     */
    public Circle() {
    }

    /**
     * Constructor parametrizado
     * @param radius Radio del circulo
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Metodo que devuelve el radio del circulo
     * @return Radio del circulo
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Metodo que establece el radio del circulo
     * @param radius Radio del circulo
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Metodo que devuelve el area del circulo
     * @return Area del circulo
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Metodo que devuelve el perimetro del circulo
     * @return Perimetro del circulo
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Metodo que devuelve la informacion del circulo
     * @return Informacion del circulo
     */
    @Override
    public String toString() {
        return "Circulo de radio " + radius + ".";
    }

}
