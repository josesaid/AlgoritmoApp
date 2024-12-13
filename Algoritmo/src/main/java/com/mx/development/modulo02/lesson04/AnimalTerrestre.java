package com.mx.development.modulo02.lesson04;

public class AnimalTerrestre extends Animal{
    AnimalTerrestre(){
        super.comer();
    }

    public void comer(){
        System.out.println("El animal terrestre se arrastra para comer...");
    }

    void arrastrarse(){
        System.out.println("Arrastrándose");
    }

}
