package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {
    private double radio;

    /**
     * Metodo constructor parametrizado
     * @param radio Radio del circulo
     */
    public Circle(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    /**
     * Metodo que calcula el perimetro
     * @return Perimetro de la figura
     */
    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radio;
    }

    /**
     * Metodo que calcula el area
     * @return Area de la figura
     */
    @Override
    public double calculateArea() {
        return 3.14 * radio * radio;
    }

    /**
     * toString de Circle
     * @return String de area y perimetro de Circle
     */
    @Override
    public String toString() {
        return "Area = " + calculateArea() + "\nPerimetro = " + calculatePerimeter();
    }
}
