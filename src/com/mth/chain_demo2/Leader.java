package com.mth.chain_demo2;

public abstract class Leader implements IPower {

    private int expenses; //当前领导审批的额度
    private Leader mSuperLeader; //上级领导

    public Leader(int expenses) {
        this.expenses = expenses;
    }

    /**
     * 设置上级领导
     *
     * @param leader
     */
    public void setmSuperLeader(Leader leader) {
        this.mSuperLeader = leader;
    }

    protected abstract void apply(ProgramApes ape);

    @Override
    public void handleRequest(ProgramApes ape) {
        if (ape.getExpenses() <= expenses) {
            apply(ape);
        } else {
            if (mSuperLeader != null) {
                mSuperLeader.handleRequest(ape);
            } else {
                System.out.println("Goodbye my money......");
            }
        }
    }
}
