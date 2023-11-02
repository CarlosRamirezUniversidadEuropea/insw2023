package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import java.util.List;

public class Empresa {
    /**
     * Name of the company
     */
    private String nombre;

    /**
     * List of employees of the company
     */
    private List<Empleado> empleados;
    /**
     * List of clients of the company
     */
    private List<Cliente> clientes;

    /**
     * Constructor
     * @param name Name of the company
     * @param employees Employees of the company
     * @param clients Clients of the company
     */
    public Empresa(String name, List<Empleado> employees, List<Cliente> clients) {
        this.nombre = name;
        this.empleados = employees;
        this.clientes = clients;
    }

    /**
     * To string method to print the object
     */
    @Override
    public String toString() {
        return "Empresa{" + "name=" + nombre + ", employees=" + empleados + ", clients=" + clientes + '}';
    }

    /**
     * Getter for the name of the company
     * @return Name of the company
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter for the name of the company
     * @param name Name of the company
     */
    public void setNombre(String name) {
        this.nombre = name;
    }

    /**
     * Get the list of employees
     * @return List of employees
     */
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Set the list of employees
     * @param empleados List of employees
     */
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Get the list of clients
     * @return List of clients
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Set the list of clients
     * @param clientes List of clients
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
