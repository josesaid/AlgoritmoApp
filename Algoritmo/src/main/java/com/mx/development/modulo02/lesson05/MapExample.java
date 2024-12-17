package com.mx.development.modulo02.lesson05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Ani");
        mapa.put(2, "Matias");

        Set<Map.Entry<Integer, String>> filas =  mapa.entrySet();
        for(Map.Entry fila : filas){
            System.out.println("fila =  Key: " + fila.getKey()+" tiene el valor: " + fila.getValue());
        }
    }

}
