package com.mth.chain_demo1;

public class ChainHandler3 extends Handler {

    @Override
    public void handlerRequest(String condition) {
        System.out.println("ChainHandler3 default handle condition = " + condition);
    }
}
