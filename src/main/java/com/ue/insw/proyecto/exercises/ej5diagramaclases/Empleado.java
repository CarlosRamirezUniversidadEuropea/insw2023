package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona {
    private double sueldo_bruto;

    public Empleado(String nombre, String apellido, int edad, double sueldo_bruto) {
        super(nombre, apellido, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public void mostrar() {
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sueldo bruto: " + sueldo_bruto);
        System.out.println("Salario neto: " + calcular_salario_neto());
    }

    public double calcular_salario_neto() {
        // Se establece un 80% del salario bruto como salario neto, pero se puede cambiar la formula
        // para que calcule el salario neto de otra forma.
        return sueldo_bruto * 0.8;
    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
}