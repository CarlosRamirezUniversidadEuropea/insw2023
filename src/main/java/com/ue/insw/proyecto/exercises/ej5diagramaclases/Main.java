package com.ue.insw.proyecto.exercises.ej5diagramaclases;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
                DecimalFormat df = new DecimalFormat();
                Persona persona = new Persona("Paula", 32);
                Empleado empleado = new Empleado("Alejandra", 23, 15000);
                Cliente cliente = new Cliente("Rafael", 47, "Google", "678909876");
                Directivo directivo = new Directivo("Penelope", 39, 18.90,"CEO");
                Empresa empresa = new Empresa("Amazon");

                System.out.println("Persona");
                persona.mostrar();
                System.out.println("");

                System.out.println("Empleado");
                empleado.mostrar();
                System.out.println("Salario Neto: " +df.format(empleado.calcularSalarioNeto())+ "€");
                System.out.println("");

                System.out.println("Cliente");
                cliente.mostrar();
                System.out.println("");

                System.out.println("Directivo");
                directivo.mostrar();
            }
        }