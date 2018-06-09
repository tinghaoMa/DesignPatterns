package com.mth.builder;

public interface Builder<T> {
    /**
     * 装CPU
     */
    void buildCpu();

    /**
     * 装主板
     */
    void buildMainBord();

    /**
     * 获得造好的东西
     * @return
     */
    T getProduct();

}
