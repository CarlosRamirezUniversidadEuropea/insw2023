package com.ue.insw.proyecto.exercises.ej0documentation;

/**
 * This class contains the attributes and methods of an employee
 * @author Carlos Ram�rez
 * @version 1.0
 * @see Persona
 */
public class Empleado extends Persona{
    
    private int numeroEmpleado;
    private String departamento;
    private String puesto;
    
    /**
     * Default constructor method
     */
    public Empleado(){
    }
    
    /**
     * Parameterized constructor method
     * @param nombre Employee's name
     * @param edad Employee's age
     * @param sexo Employee's gender in H or M format
     * @param numeroEmpleado Employee's number
     * @param departamento Department where the employee will work
     * @param puesto Position that the employee will hold within the company
     */
    public Empleado(String nombre, 
                    int edad, 
                    char sexo, 
                    int numeroEmpleado, 
                    String departamento, 
                    String puesto){
        super(nombre, edad, sexo);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    
    /**
     * Returns a string representation of the object
     * @return Returns a string with the employee's information
     */
    @Override
    public String toString() {
        return "Empleado [nombre=" + getNombre() + ", edad=" + getEdad() + ", sexo=" + getSexo() + ", numeroEmpleado=" + this.numeroEmpleado
                + ", departamento=" + this.departamento + ", puesto=" + this.puesto + "]";
    }
    
    /**
     * Method to return the employee's number
     * @return Returns the employee's number
     */
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
    
    /**
     * Sets the employee's number
     * @param numeroEmpleado Number that will be assigned to the employee
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    /**
     * Method that returns the name of the department assigned to the employee
     * @return Returns the department
     */
    public String getDepartamento() {
        return departamento;
    }
    
    /**
     * Method that assigns a department to an employee
     * @param departamento Department name
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    /**
     * Method that returns the employee's position
     * @return Returns a String indicating the position
     */
    public String getPuesto() {
        return puesto;
    }
    
    /**
     * Method that sets the employee's position
     * @param puesto Indicates the employee's position
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}