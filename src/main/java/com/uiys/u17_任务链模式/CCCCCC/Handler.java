package com.uiys.u17_任务链模式.CCCCCC;

/**
 * @Author : JCccc
 * @CreateTime : 2019-1-7
 * @Description :
 * @Point: Keep a good mood
 **/
public abstract class Handler {
    private int days = 0;
    private Handler nextHandler;

    public void HandleRequest(float days) {
        if (IsInResposibilityScope(days)) {
            Sign();
        } else {
            //            if (GetNext() != null){
            //                GetNext().HandleRequest(days);
            //            }
            if (nextHandler != null) {
                nextHandler.HandleRequest(days);
            } else {
                System.out.println("请假太久了，不批不批！");
            }
        }
    }

    //设置下一个处理请假请求的人
    public void SetNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //获取下一个处理请假请求的人
    public Handler GetNext() {
        return nextHandler;
    }

    // 这个请假天数是否在自己的职责范围内
    protected abstract boolean IsInResposibilityScope(float days);

    // 领导签字，表示请假得到了审批，具体怎么批由个个继承子类去编写逻辑
    protected abstract void Sign();

}

