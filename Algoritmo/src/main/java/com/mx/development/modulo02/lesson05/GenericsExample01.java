package com.mx.development.modulo02.lesson05;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample01 {
    public static void main(String[] args) {
        /*List lista = new ArrayList<>();
        lista.add(new Perro());
        lista.add(new Casa());
        lista.add(new Celular());
        System.out.println(lista);*/
        List<String> lista = new ArrayList<>();
        lista.add("hola1");
        lista.add("hola2");
        lista.add("hola3");
        System.out.println(lista);
    }

}

/* class Perro{
    @Override
    public String toString() {
        return "un perro";
    }
}
class Casa{
    @Override
    public String toString() {
        return "una casa azul";
    }
}
class Celular{
    @Override
    public String toString() {
        return "un celular barato";
    }
} */