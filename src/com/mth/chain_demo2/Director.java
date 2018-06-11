package com.mth.chain_demo2;

public class Director extends Leader {
    public Director(int expenses) {
        super(expenses);
    }


    @Override
    protected void apply(ProgramApes ape) {
        System.out.println(ape.getReply());
        System.out.println("Director: Of course Yes!");
    }
}
