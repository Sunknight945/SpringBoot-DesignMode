package com.uiys.u17_任务链模式.CCCCCC;

/**
 * @Author : JCccc
 * @CreateTime : 2019-1-7
 * @Description :
 * @Point: Keep a good mood
 **/
public class Manager extends Handler {
    @Override
    protected  boolean IsInResposibilityScope(float days) {
        return days > 2 && days <= 5;
    }
    @Override
    protected  void Sign() {
        System.out.println("经理签字同意了");
    }
}