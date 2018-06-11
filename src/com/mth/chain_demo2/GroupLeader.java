package com.mth.chain_demo2;

public class GroupLeader extends Leader {

    public GroupLeader(int expenses) {
        super(expenses);
    }

    @Override
    protected void apply(ProgramApes ape) {
        System.out.println(ape.getReply());
        System.out.println("GroupLeader: Of course Yes!");
    }
}
