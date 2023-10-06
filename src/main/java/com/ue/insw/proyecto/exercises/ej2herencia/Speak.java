package com.ue.insw.proyecto.exercises.ej2herencia;

    public interface Speak {
        void speak();
        class Cat implements Speak{
            @Override
            public void speak() {
                System.out.println("miau");
            }
        }
        class Dog implements Speak {
            @Override
            public void speak() {
                System.out.println("woof");
            }
        }
    }
        class Human implements Speak{
            @Override
            public void speak() {
                System.out.println("Hola. Como estas? ");
            }
        }

