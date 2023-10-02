package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//class circulo
public class Circle {
    double radio;
    double pi = 3.1416;

    public Circle(double radius){
        this.radio = radius;
    }

    public double calcularPerimetro(){
        return 2*pi*radio;
    }

    public double calcularArea(){
        return pi*radio*radio;
    }

    public String toString(){
        return "Radio de Circulo: " + radio;
    }
}
