package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape

/**
 * Esta clase contiene los atributos y metodos de un rectangulo
 * @author Pablo Embil González
 * @version 1.0
 * @see Rectangle
 */

public class Rectangle extends Shape{

    private double lado1;
    private double lado2;

    /**
     * Metodo constructor por defecto
     */

    public Rectangle() {

    }

    /**
     * Metodo constructor parametrizado
     * @param lado1 Nombre del alumno
     * @param lado2 Edad del alumno
     */

    public Rectangle (double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Metodo para regresar el lado1
     * @return Regresa el lado1
     */
    public double getLado1() {
        return lado1;
    }
    /**
     * Establece el lado1
     * @param lado1
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Metodo para regresar el lado2
     * @return Regresa el lado2
     */
    public double getLado2() {
        return lado2;
    }
    /**
     * Establece el lado2
     * @param lado2
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Metodo para regresar el area
     * @return Regresa area
     */
    @Override
    public double calcularPerimetro() {
        double area = lado1 * lado2;
        return area;
    }

    /**
     * Metodo para regresar el area
     * @return Regresa area
     */
    @Override
    public double calcularArea() {
        double perimetro = lado1 + lado1 + lado2 + lado2;
        return perimetro;
    }

    /**
     * Metodo para establecer el toString()
     * @return Información sobre el alumno
     */
    @Override
    public String toString() {
        return "Rectangulo [area " + calcularArea() +
                ", perimetro " + calcularPerimetro() + "]";
    }

}
