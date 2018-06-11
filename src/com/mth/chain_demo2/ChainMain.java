package com.mth.chain_demo2;

public class ChainMain {

    public static void main(String[] args) {
        AndroidApe androidApe = new AndroidApe(8000);

        GroupLeader leader = new GroupLeader(1000);

        Director director = new Director(3000);

        Boss boss = new Boss(10000);


        leader.setmSuperLeader(director);
        director.setmSuperLeader(boss);

        leader.handleRequest(androidApe);
    }
}
