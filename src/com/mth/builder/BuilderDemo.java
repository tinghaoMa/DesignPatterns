package com.mth.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Computer computer = builder.getProduct();
        computer.Show();
    }
}
