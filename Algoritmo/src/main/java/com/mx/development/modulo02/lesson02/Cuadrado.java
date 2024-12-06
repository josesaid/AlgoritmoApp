package com.mx.development.modulo02.lesson02;

public class Cuadrado extends Figura{

    public void dibujar(String algo) {
        System.out.println(Cuadrado.class.getCanonicalName() + "-> " + algo);
        System.out.println("Ahora llamo al otro metodo hermano...");
        super.dibujar();
    }

}
