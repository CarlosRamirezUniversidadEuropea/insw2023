package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{

        double sueldoBruto;

        public Empleado(String nombre, int edad, double sueldoBruto) {
            super(nombre, edad);
            this.sueldoBruto = sueldoBruto;
        }

        public Empleado() {
            super();
        }

        public void mostrar() {
            super.mostrar();
            System.out.println("Sueldo bruto: " + this.sueldoBruto);
        }

    public double calcularSalarioNeto(){
        double salarioNeto, impuestos;
        impuestos = sueldoBruto * 0.06;
        salarioNeto = sueldoBruto - impuestos;
        return salarioNeto;
    }
    }


