package com.mth.chain;

public class ChainHandler3 extends Handler {

    @Override
    public void handlerRequest(String condition) {
        System.out.println("ChainHandler3 default handle condition = " + condition);
    }
}
