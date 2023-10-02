package com.ue.insw.proyecto.exercises.ej3polimorfismo;

/**
 * Main class
 * @author Pablo Ribas Borrego
 */
public class Main {

    public static void main(String[] args) {
        
        // Creamos un circulo
        Circle circulo = new Circle(2.5);

        // Creamos un rectangulo
        Rectangle rectangulo = new Rectangle(5, 10);

        System.out.println("Ejercicio 3: Polimorfismo");
        System.out.println("Realizado por Pablo Ribas Borrego (AWDn0n)\n");

        // Imprimimos por pantalla el area y el perimetro del circulo
        System.out.println("===== CIRCULO =====");
        System.out.println(circulo.toString());
        System.out.println("Area del circulo: " + circulo.calculateArea());
        System.out.println("Perimetro del circulo: " + circulo.calculatePerimeter() + "\n");

        // Imprimimos por pantalla el area y el perimetro del rectangulo
        System.out.println("===== RECTANGULO =====");
        System.out.println(rectangulo.toString());
        System.out.println("Area del rectangulo: " + rectangulo.calculateArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calculatePerimeter());        

    }
}
