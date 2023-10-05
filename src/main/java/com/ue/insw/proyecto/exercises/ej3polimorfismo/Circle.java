package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
/**
 * Esta clase contiene los atributos y metodos de un circulo
 * @author Pablo Embil González
 * @version 1.0
 * @see Circle
 */

public class Circle extends Shape{

    private double radio;

    /**
     * Metodo constructor por defecto
     */

    public Circle() {

    }

    /**
     * Metodo constructor parametrizado
     * @param radio Nombre del alumno
     */

    public Circle (double radio) {
        this.radio = radio;
    }


    /**
     * Metodo para regresar el radio
     * @return Regresa el radio
     */
    public double getRadio() {
        return radio;
    }
    /**
     * Establece el radio
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }


    /**
     * Metodo para regresar el area
     * @return Regresa area
     */
    @Override
    public double calcularArea() {

        double area = getRadio() * getRadio() * 3.141592;

        return area;
    }

    /**
     * Metodo para regresar el periemtro
     * @return Regresa periemtro
     */
    @Override
    public double calcularPerimetro() {

        double perimetro = 2 * getRadio() * 3.141592;

        return perimetro;
    }


    /**
     * Metodo para establecer el toString()
     * @return Información sobre el alumno
     */
    @Override
    public String toString() {
        return "Circulo [area " + calcularArea() +
                ", perimetro " + calcularPerimetro() + "]";
    }

}