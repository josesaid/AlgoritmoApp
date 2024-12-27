package com.mx.development.modulo02.lesson07;

public class SubClaseB extends SuperClaseA implements InterfaceD{
    public void subMetodo(){
        superMetodo();
        System.out.println("Este es un método de la subclase.");
    }

    @Override
    public void metodoInterfaceD() {
        System.out.println("Implementación del método interface D...");
    }
}
