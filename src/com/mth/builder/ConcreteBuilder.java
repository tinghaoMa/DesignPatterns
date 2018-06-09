package com.mth.builder;

/**
 * 电脑组装人员
 */
public class ConcreteBuilder implements Builder<Computer> {

    Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.addPart(" cpu ");
    }

    @Override
    public void buildMainBord() {
        computer.addPart("主板");
    }

    @Override
    public Computer getProduct() {
        return computer;
    }
}
