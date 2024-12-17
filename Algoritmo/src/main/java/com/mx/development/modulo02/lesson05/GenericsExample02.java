package com.mx.development.modulo02.lesson05;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample02 {
    public static void main(String[] args) {
        List<Flor> ramoFlores = new ArrayList<>();
        ramoFlores.add(new Flor());
        ramoFlores.add(new Flor());
        ramoFlores.add(new Flor());
        ramoFlores.add(new Flor());
        System.out.println(ramoFlores);
    }
}
