package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Rectangle extends Shape {
    private double ladoCorto;
    private double ladoLargo;
    private double perimetro;

    private double area;

    public Rectangle(double ladoCorto, double ladoLargo, double perimetro, double area){
        this.ladoCorto = ladoCorto;
        this.ladoLargo = ladoLargo;
        this.perimetro = perimetro;
        this.area = area;
    }
    @Override
    public double calculatePerimeter() {
        perimetro =  2 * (ladoCorto + ladoLargo);
        return  perimetro;
    }

    @Override
    public double calculateArea() {
        area = ladoCorto*ladoLargo;
        return area;
    }

    @Override
    public String toString() {
        return "Perimetro: " + perimetro + " " + "Area: " + area;
    }
}
