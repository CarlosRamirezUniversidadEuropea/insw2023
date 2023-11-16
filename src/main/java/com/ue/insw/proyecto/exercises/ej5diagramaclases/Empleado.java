package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{
    private int sueldo_bruto;

    public Empleado(String nombre, int edad, int sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

}
