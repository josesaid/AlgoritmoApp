package com.mx.development.modulo02.lesson07;

public class InstanceOfExample {
    public static void main(String[] args) {
        SuperClaseA instanciaA = new SuperClaseA();
        System.out.println(instanciaA instanceof Object);
        System.out.println(instanciaA instanceof SuperClaseA);
        System.out.println("-> " + (instanciaA instanceof InterfaceD));


        SubClaseB   instanciaB = new SubClaseB();
        System.out.println(instanciaB instanceof Object);
        System.out.println(instanciaB instanceof SubClaseB);
        System.out.println("--> " + (instanciaB instanceof InterfaceD));

        SuperClaseA instanciaC = new SubClaseB();
        System.out.println(instanciaC instanceof Object);
        System.out.println(instanciaC instanceof SuperClaseA);
        System.out.println(instanciaC instanceof SubClaseB);
    }

}
