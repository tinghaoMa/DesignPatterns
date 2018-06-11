package com.mth.chain_demo1;

public abstract class Handler {

    private Handler mHandler;


    public Handler getmHandler() {
        return mHandler;
    }

    public void setmHandler(Handler mHandler) {
        this.mHandler = mHandler;
    }

    /**
     * 处理方法
     * @param condition
     */
    public abstract void handlerRequest(String condition);
}
