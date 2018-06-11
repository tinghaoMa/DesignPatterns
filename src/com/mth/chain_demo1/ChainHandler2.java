package com.mth.chain_demo1;

public class ChainHandler2 extends Handler {

    @Override
    public void handlerRequest(String condition) {
        // 如果是自己的责任，就自己处理，负责传给下家处理
        if(condition.equals("ConcreteHandler2")){
            System.out.println( "ConcreteHandler2 handled ");
            return ;
        }else{
            System.out.println( "ConcreteHandler2 passed ");
            getmHandler().handlerRequest(condition);
        }
    }
}
