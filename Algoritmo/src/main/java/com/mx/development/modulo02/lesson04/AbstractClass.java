package com.mx.development.modulo02.lesson04;

public abstract class AbstractClass implements InterfaceA{

}

class ClaseConcretaA extends AbstractClass{
    @Override
    public void a() {

    }
}


interface InterfaceA{
    public abstract void a();
}
