package com.ue.insw.proyecto.exercises.ej1interfaz.objects;


import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;


public class Vehicle {


        private BigDecimal price;
        private int speed;
        private Brand brand;
        private Color color;
        private int maxSpeed;
        private Status status; // Determina si el coche esta en "on" o "off"
        private Gasoline gasoline; // Tipo de gasolina del coche
        private double tankCapacity; // Capacidad del deposito

        public Vehicle(BigDecimal price, Brand brand, Color color, int maxSpeed, Gasoline gasoline, double tankCapacity) {
            this.price = price;
            this.brand = brand;
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.speed = 0;
            this.status = STOPED;
            this.gasoline = gasoline;
            this.tankCapacity = tankCapacity;
        }

        public BigDecimal getPrice(){
            return price;
        }

        //todo
        public void on() {
            this.status = ON;
        }

        //todo
        public void stop() {
            this.speed = 0;
            this.status = STOPED;
        }

        //todo
        public void setSpeed(int speed) {
            this.speed = speed;
        }

        /**
         * fills the car with gasoline
         * @param gasoline type of gas
         * @param liters number of liters
         */
        public void fillCombustible(Gasoline gasoline, int liters) throws Exception{
            if(this.gasoline.equals(gasoline) && tankCapacity >= liters && liters>0){
                System.out.println("Se ha llenado el coche con " + liters + " litros de " + gasoline);
            }else{
                throw new Exception("No se ha podido llenar correctamente");
            }
        }

        /**
         * Starts driving the car
         * @param speed desired to drive (Km/h)
         * @param time in seconds
         */
        public void startDriving (int speed, int time) throws Exception{
            if(speed >= 0 && time > 0){
                status = ON;
                this.speed = speed;
                System.out.println("La velocidad al empezar es de " + speed + " Km/h ");
            }else{
                throw new Exception("La velocidad o el tiempo no pueden ser negativos");
            }
        }

        public Brand getBrand() {
            return brand;
        }

        public void setBrand(Brand brand) {
            this.brand = brand;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) throws Exception {
            if(maxSpeed < 0){
                throw new Exception("La velocidad no puede ser negativa");
            }else{
                this.maxSpeed = maxSpeed;
            }
        }

        public int getSpeed() {
            return speed;
        }

        public Status getStatus() {
            return status;
        }

        public Gasoline getGasoline() {
            return gasoline;
        }

        public void setGasoline(Gasoline gasoline) {
            this.gasoline = gasoline;
        }

        public double getTankCapacity() {
            return tankCapacity;
        }

        public void setTankCapacity(double tankCapacity) {
            this.tankCapacity = tankCapacity;
        }

        public void setStatus(Status status) {
            this.status = status;
        }
}
