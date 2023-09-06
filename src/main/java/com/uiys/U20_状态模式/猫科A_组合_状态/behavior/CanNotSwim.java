package com.uiys.U20_状态模式.猫科A_组合_状态.behavior;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class CanNotSwim implements ISwimBehavior {

    @Override
    public String swim() {
        return "不会游泳";
    }
}


