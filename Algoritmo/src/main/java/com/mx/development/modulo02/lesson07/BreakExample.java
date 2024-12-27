package com.mx.development.modulo02.lesson07;

public class BreakExample {
    public static void main(String[] args) {
        externo:
            for(int i=1; i<=10; i++){
                interno:
                    for(int j=1; j<=10; j++){
                        int x = i*j;
                        System.out.print(x+" ");
                        if (x==50){
                            break externo;
                        }
                    }
            System.out.println();
        }
        System.out.println("Adios");
    }
}
