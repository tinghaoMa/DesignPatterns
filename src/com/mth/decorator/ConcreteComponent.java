package com.mth.decorator;

public class ConcreteComponent extends Component {

    @Override
    public void opreate() {
        System.out.println("ConcreteComponent.opreate 我是原本实现");
    }
}
