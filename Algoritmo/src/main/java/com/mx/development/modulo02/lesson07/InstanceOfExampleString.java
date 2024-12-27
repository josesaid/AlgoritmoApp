package com.mx.development.modulo02.lesson07;

public class InstanceOfExampleString {
    public static void main(String[] args) {
        Object o = new String();
        o = "26-dec-2024";

        //JDK 14
        if(o instanceof String s){
            System.out.println("Algo: " + s.toUpperCase());
        }else {
            System.out.println("Otra cosa: " + o.toString());
        }


        // JDKs anteriores a JDK 14
        if(o instanceof String){
            System.out.println("Algo: " + ((String)o).toUpperCase());
        }else {
            System.out.println("Otra cosa: " + o.toString());
        }

    }

}
