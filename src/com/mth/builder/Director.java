package com.mth.builder;

public class Director {


    public Director(Builder builder) {
        builder.buildCpu();
        builder.buildMainBord();
    }
}
