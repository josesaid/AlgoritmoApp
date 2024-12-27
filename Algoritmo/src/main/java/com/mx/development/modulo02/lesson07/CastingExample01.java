package com.mx.development.modulo02.lesson07;

public class CastingExample01 {
    public static void main(String[] args) {
        SuperClaseA superInstancia = new SubClaseB(); //Up-Casting
        superInstancia.superMetodo(); //VMI - Virtual Method Invocation

        ((SubClaseB)superInstancia).subMetodo(); //Down-Casting | Conversión explícita.
    }

}
