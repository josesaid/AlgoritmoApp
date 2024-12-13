package com.mx.development.modulo02.lesson04;

public class Animal implements Comer{
    @Override
    public void comer() {
        System.out.println("un animal está comiendo...");
    }

    void sumergirseEnAgua(){
        System.out.println("Sumergirse en el agua");
    }

}
