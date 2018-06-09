package com.mth.chain;

public class ChainHandler1 extends Handler {

    @Override
    public void handlerRequest(String condition) {
        // 如果是自己的责任，就自己处理，负责传给下家处理
        if(condition.equals("ConcreteHandler1")){
            System.out.println( "ConcreteHandler1 handled ");
            return ;
        }else{
            System.out.println( "ConcreteHandler1 passed ");
            getmHandler().handlerRequest(condition);
        }
    }
}
