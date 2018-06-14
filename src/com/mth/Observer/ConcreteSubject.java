package com.mth.Observer;

public class ConcreteSubject extends Subject {

    @Override
    public void notifyState() {
        //遍历观察者集合，调用每一个观察者的响应方法
        for(Object obs:observers) {
            ((Observer)obs).update();
        }
    }
}
