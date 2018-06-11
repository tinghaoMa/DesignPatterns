package com.mth.chain_demo2;

public class Boss extends Leader {

    public Boss(int expenses) {
        super(expenses);
    }

    @Override
    protected void apply(ProgramApes ape) {
        System.out.println(ape.getReply());
        System.out.println("Boss: Of course Yes!");
    }
}
