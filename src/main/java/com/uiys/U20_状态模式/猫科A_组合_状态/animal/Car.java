package com.uiys.U20_状态模式.猫科A_组合_状态.animal;

import com.uiys.U20_状态模式.猫科A_组合_状态.behavior.CanClimb;
import com.uiys.U20_状态模式.猫科A_组合_状态.behavior.CanNotSwim;
import com.uiys.U20_状态模式.猫科A_组合_状态.behavior.ISwimBehavior;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Car extends AbstractFeline  {

    public Car() {
        setClimb(new CanClimb());
        setSwim(new CanNotSwim());
    }

    /**
     * 也可以把能否行为在初始化的时候设定
     * @param swimBehavior 是否可以游泳
     */
    public Car(ISwimBehavior swimBehavior){
        setSwim(swimBehavior);
        setClimb(new CanClimb());
    }

    @Override
    public String getName() {
        return "我是猫";
    }
}


