package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//clase rectangulo
public class Rectangle {
    double base;
    double altura;

    public Rectangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro(){
        return 2*base + 2*altura;
    }

    public double calcularArea(){
        return base*altura;
    }

    public String toString(){
        return "Base de Rectangulo: " + base + " Altura de Rectangulo: " + altura;
    }
}
