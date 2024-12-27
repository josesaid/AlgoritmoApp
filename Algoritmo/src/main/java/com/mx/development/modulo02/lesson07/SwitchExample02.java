package com.mx.development.modulo02.lesson07;

public class SwitchExample02 {
    public static void main(String[] args) {
        String product = "Apple2";
        System.out.println("------------");
        String cadena = switch (product){
            case "Apple","Peach" -> {
                System.out.println("Apple or peach...");
                yield "Fruit";
            }
            default -> {
                yield "Algo";
            }
        };
        System.out.println("cadena: " + cadena);
    }
}
