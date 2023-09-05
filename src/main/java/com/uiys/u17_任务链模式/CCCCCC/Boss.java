package com.uiys.u17_任务链模式.CCCCCC;

/**
 * @Author : JCccc
 * @CreateTime : 2019-1-7
 * @Description :
 * @Point: Keep a good mood
 **/
public class Boss extends Handler {
    @Override
    protected  boolean IsInResposibilityScope(float days) {
        return days > 5 && days <= 10;
    }
    @Override
    protected  void Sign() {
        System.out.println("老板签字同意了");
    }
}