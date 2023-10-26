package com.ue.insw.proyecto.exercises.ej3polimorfismo;

public class Main {

    public static void main(String[] args) {
        //TODO crear circulo y rectangulo y calcular su area y perímetro
//creamos un circulo

        Circle circulo = new Circle("azul", 5); // creo la istancia con un radio ya puesto
//calculamos el area y perimetro
        double areaC = circulo.calculateArea();
        double perimetroC = circulo.calculatePerimeter();
//imprimimos por pantalla
        System.out.println("el area del circulo es: "+ areaC);
        System.out.println("el perimetro del circulo de radio es: "+ perimetroC);
        System.out.println("el color del circulo es: "+ circulo.getColor());


//creamos rectangulo
        Rectangle rectangulo = new Rectangle("lila", 7);
//calculamos area y perimetro
        double areaR = rectangulo.calculateArea();
        double perimetroR = rectangulo.calculatePerimeter();
//imprimimos
        System.out.println("el area del rectangulo de radio es: "+ areaR);
        System.out.println("el perimetro del rectangulo de radio es: "+ perimetroR);
        System.out.println("el color del rectangulo es: "+ circulo.getColor());



    }
}
