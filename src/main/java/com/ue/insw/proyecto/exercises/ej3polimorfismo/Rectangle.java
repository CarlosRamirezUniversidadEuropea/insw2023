package com.ue.insw.proyecto.exercises.ej3polimorfismo;

/**
 * Esta clase contiene los atributos y metodos de un rectangulo
 * @author Pablo Ribas Borrego (AWDn0n)
 * @version 1.0
 * @see Shape
 */
public class Rectangle extends Shape {

    // Atributos
    private double width;
    private double height;

    /**
     * Constructor por defecto
     */
    public Rectangle() {
    }

    /**
     * Constructor parametrizado
     * @param width Ancho del rectangulo
     * @param height Alto del rectangulo
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Metodo que devuelve el ancho del rectangulo
     * @return Ancho del rectangulo
     */
    public double getWidth() {
        return width;
    }

    /**
     * Metodo que establece el ancho del rectangulo
     * @param width Ancho del rectangulo
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Metodo que devuelve el alto del rectangulo
     * @return Alto del rectangulo
     */
    public double getHeight() {
        return height;
    }

    /**
     * Metodo que establece el alto del rectangulo
     * @param height Alto del rectangulo
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Metodo que devuelve el area del rectangulo
     * @return Area del rectangulo
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    /**
     * Metodo que devuelve el perimetro del rectangulo
     * @return Perimetro del rectangulo
     */
    @Override
    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    /**
     * Metodo que devuelve la informacion del rectangulo
     * @return Informacion del rectangulo
     */
    @Override
    public String toString() {
        return "Rectangulo con longitud " + width + " y altura " + height + ".";
    }

}
