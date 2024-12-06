package com.mx.development.modulo02.lesson02;

public class HerramientasEscuelaMain {
    public static void main(String[] args) {
        Figura f1 = new Figura();
        f1.dibujar();

        Cuadrado c1 = new Cuadrado();
        c1.dibujar();
        c1.dibujar("algo123");

        Figura f2 = new Cuadrado();
        f2.dibujar(); //VMI
    }

}
