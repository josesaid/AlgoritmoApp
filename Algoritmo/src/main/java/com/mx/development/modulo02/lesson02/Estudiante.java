package com.mx.development.modulo02.lesson02;

import lombok.Data;

@Data public abstract class Estudiante extends Persona{
    private String nombre;

    abstract void m3();
}
