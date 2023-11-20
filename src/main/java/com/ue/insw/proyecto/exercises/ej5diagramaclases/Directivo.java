package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Directivo extends Empleado {
    private String categoria;

    public Directivo(String nombre, String apellido, int edad, double salario, String categoria) {
        super(nombre, apellido, edad, salario);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrar() {
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Categoría: " + categoria);
    }
}