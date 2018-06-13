package com.mth.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        ConcreteDecorator1 decorator1 = new ConcreteDecorator1(component);
        ConcreteDecorator2 decorator2 = new ConcreteDecorator2(component);

        decorator1.opreate();
        decorator2.opreate();
    }
}
