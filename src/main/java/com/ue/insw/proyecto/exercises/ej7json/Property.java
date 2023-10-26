package com.ue.insw.proyecto.exercises.ej7json;

public class Property {
        protected String id;
        protected String name;


        public Property(String n, String i){
            this.id = i;
            this.name = n;
        }
        public String getID(){
        return id;
    }
        public void setID(String i) {
        this.id = i;
    }
        public String getNombre(){
            return name;
        }
        public void setNombre(String n) {
            this.name = n;
        }
    @Override
        public String toString(){
             return "ID: " +id + "Name: " + name;
        }
}
