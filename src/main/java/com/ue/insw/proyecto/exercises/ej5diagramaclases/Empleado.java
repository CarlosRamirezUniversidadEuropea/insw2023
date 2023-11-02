package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona{
    /**
     * Salary of the employee
     */
     private int sueldo_bruto;

     /**
      * Constructor
        * @param name Name of the employee
        * @param age Age of the employee
        * @param salary Salary of the employee
      */
    public Empleado(String name, int age, int salary) {
        super(name, age);
        this.sueldo_bruto = salary;
    }

    /**
     * To string method to print the object
     */
    public String mostrar() {
        return "Empleado{" + "name=" + getNombre() + ", age=" + getEdad() + ", salary=" + sueldo_bruto + '}';
    }

    /**
     * Getter for the salary of the employee
     * @return Salary of the employee
     */
    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    /**
     * Setter for the salary of the employee
     * @param salary Salary of the employee
     */
    public void setSueldo_bruto(int salary) throws Exception{
        // check if the salary is positive and if not throw an exception
        if (salary < 0) {
            throw new Exception("Salary must be positive");
        } else {
            this.sueldo_bruto = salary;
        }
    }

    /**
     * Method to calculate the net salary of the employee
     * @return Net salary of the employee
     */
    public int calcular_salario_neto() {
        return (int) (sueldo_bruto * 0.8);
    }

}
