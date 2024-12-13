package com.mx.development.modulo02.lesson04;

public class Persona implements Comer, Brincar{
    void hablar(){
        System.out.println("hablar....");
    }

    @Override
    public void comer() {
        System.out.println("una persona está comiendo...");
    }

    @Override
    public void brincar() {
        System.out.println("Brincar");
    }

}
