package com.mth.chain;

/**
 * @author itck_mth
 * <p>
 * 理想责任链
 */
public class ChainDemo {

    public static void main(String[] args) {
        ChainHandler1 handler1 = new ChainHandler1();
        ChainHandler2 handler2 = new ChainHandler2();
        ChainHandler3 handler3 = new ChainHandler3();
        handler1.setmHandler(handler2);
        handler2.setmHandler(handler3);


        handler1.handlerRequest("ConcreteHandler3");
    }

}
