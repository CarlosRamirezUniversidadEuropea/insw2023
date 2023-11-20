package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente  extends Persona{
    String nombreEmpresa;
    String telefonoDeContacto;

        public Cliente(String nombre, int edad, String nombre_empresa, String telefono_de_contacto){
            super(nombre, edad);
            this.nombreEmpresa = nombre_empresa;
            this.telefonoDeContacto = telefono_de_contacto;
        }

        public void mostrar(){
            System.out.println("Nombre: " +nombre);
            System.out.println("Edad: " +edad);
            System.out.println("Nombre de Empresa: " + nombreEmpresa);
            System.out.println("Telefono de Contacto: " + telefonoDeContacto);
        }
    }

