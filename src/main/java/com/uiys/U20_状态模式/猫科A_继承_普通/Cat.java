package com.uiys.U20_状态模式.猫科A_继承_普通;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Cat extends AbstractFeline{
    @Override
    public void swimming() {
        System.out.println("我是【" + getName() + "】,我怕水，我不会游泳");
    }

    @Override
    public String getName() {
        return "喵子";
    }
}


