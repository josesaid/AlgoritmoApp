package com.mx.development.modulo02.lesson02;

public class AbstractClassesExample {
    public static void main(String[] args) {
        Estudiante rodrigo = new EstudiantePrimaria();
        rodrigo.setNombre("Rodrigo O R");

        new AbstractClassesExample().recibeEstudiante(rodrigo);
    }

    void recibeEstudiante(Estudiante e){
        System.out.println(e.getNombre());
    }
}
