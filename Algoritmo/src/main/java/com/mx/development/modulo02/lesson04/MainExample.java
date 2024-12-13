package com.mx.development.modulo02.lesson04;

public class MainExample {
    static private Comer c;
    public static void main(String[] args) {
        c = new Persona();
        c.comer();
        Persona p1 = (Persona)c;
        p1.hablar();
        p1.comer();

        c = new Animal();
        c.comer();
        Animal a1 = (Animal)c;
        a1.sumergirseEnAgua();
        a1.comer();

        c = new AnimalTerrestre();
        c.comer();
        AnimalTerrestre at = (AnimalTerrestre)c;
        at.sumergirseEnAgua();
        at.arrastrarse();
        at.comer();

    }

}
