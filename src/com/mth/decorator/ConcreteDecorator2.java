package com.mth.decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component _component) {
        super(_component);
    }


    private void method2() {
        System.out.println("ConcreteDecorator2.method2 装饰2");
    }

    @Override
    public void opreate() {
        method2();
        super.opreate();
    }
}
