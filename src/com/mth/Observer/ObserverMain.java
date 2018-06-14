package com.mth.Observer;

public class ObserverMain {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer=new ConcreteObserver();
        subject.attach(observer);
        subject.notifyState();
    }
}
