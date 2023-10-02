package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape{
    double base;
    double altura;
    double area;
    double perimetro;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = calculateArea();
        this.perimetro = calculatePerimeter();
    }

    boolean isSquare(){
        return base == altura;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * base + 2 * altura;
    }

    @Override
    public double calculateArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        if(!isSquare())
        return "Rectangle{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
        return "Square{" +
                "lado=" + base +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
