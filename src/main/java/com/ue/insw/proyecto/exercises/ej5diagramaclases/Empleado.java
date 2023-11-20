package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona {
    
    // Atributos
    private double sueldo_bruto;

    /**
     * Constructor de la clase
     * @param nombre Nombre del empleado
     * @param edad Edad del empleado
     * @param sueldo_bruto Sueldo bruto del empleado
     */
    public Empleado(String nombre, int edad, double sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    // Getters y setters
    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        if (sueldo_bruto < 0) {
            throw new IllegalArgumentException("El sueldo bruto no puede ser negativo");
        } else {
            this.sueldo_bruto = sueldo_bruto;
        }
    }

    /**
     * Calcula el sueldo neto del empleado
     * @return Sueldo neto del empleado
     */
    public double calcularSueldoNeto() {
        return sueldo_bruto * 0.8;
    }

}
