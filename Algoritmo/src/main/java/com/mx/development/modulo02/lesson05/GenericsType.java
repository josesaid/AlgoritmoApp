package com.mx.development.modulo02.lesson05;

public class GenericsType<T> {
    private T t;
    public T get(){
        return this.t;
    }
    public void set(T t1){
        this.t=t1;
    }
    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Codegym"); //valid
        System.out.println(type.get());

        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Generics Lesson"); //valid
        System.out.println(type1.get());

        //Esto no es usado comunmente en proyectos, pero ustedes lo aprendieron aquí.
        System.out.println(type1.t.toString());

        int x = 10;
        Integer i = x;
        type1.set(i); //valid and autoboxing support
        System.out.println(type1.get());

    }
}
