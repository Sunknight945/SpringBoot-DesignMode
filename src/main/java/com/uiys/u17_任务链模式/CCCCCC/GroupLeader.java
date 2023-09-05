package com.uiys.u17_任务链模式.CCCCCC;

/**
 * @Author : JCccc
 * @CreateTime : 2019-1-7
 * @Description :
 * @Point: Keep a good mood
 **/
public class GroupLeader extends Handler {
    @Override
//重写审批请假天数的方法，加上直属领导的责任权限逻辑
    protected boolean IsInResposibilityScope(float days) {

        return days <= 2;
    }

    @Override
//重写属于直属领导的签字审批方法
    protected void Sign() {
        System.out.println("直属领导签字同意了");
    }
}

