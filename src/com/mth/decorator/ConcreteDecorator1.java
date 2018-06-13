package com.mth.decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component _component) {
        super(_component);
    }

    private void method1() {
        System.out.println("ConcreteDecorator1.method1 装饰1");
    }

    @Override
    public void opreate() {
        method1();
        super.opreate();
    }
}
