package com.mth.chain_demo2;

public class AndroidApe extends ProgramApes {

    private int expenses;

    public AndroidApe(int expenses) {
        this.expenses = expenses;
    }

    @Override
    public int getExpenses() {
        return expenses;
    }

    @Override
    public String getReply() {
        return "给爹一点出差的路费";
    }
}
