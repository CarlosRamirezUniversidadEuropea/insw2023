package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {
    private double base;
    private double altura;

    /**
     * Metodo constructor parametrizado
     *
     * @param base   Base del rectangulo
     * @param altura Altura del rectangulo
     */
    public Rectangle(double base, double altura, String color) {

        super(color);
        this.base = base;
        this.altura = altura;

    }

    /**
     * Metodo que calcula el perimetro
     *
     * @return Perimetro de la figura
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (base + altura);
    }

    /**
     * Metodo que calcula el area
     *
     * @return Area de la figura
     */
    @Override
    public double calculateArea() {
        return base * altura;
    }

    /**
     * toString de Rectangulo
     *
     * @return String de area y perimetro de Rectangulo
     */
    @Override
    public String toString() {
        return "Area = " + calculateArea() + "\nPerimetro = " + calculatePerimeter();
    }
}
