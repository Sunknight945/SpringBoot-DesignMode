package com.uiys.U20_状态模式.猫科A_继承_普通;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Lion extends AbstractFeline{
    @Override
    public String getName() {
        return "老虎";
    }

    @Override
    public void climbing() {
        System.out.println("我是【" + getName() + "】,我太笨重了，我不会爬树！");
    }

}


