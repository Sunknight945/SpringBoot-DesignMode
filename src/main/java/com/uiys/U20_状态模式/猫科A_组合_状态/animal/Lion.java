package com.uiys.U20_状态模式.猫科A_组合_状态.animal;

import com.uiys.U20_状态模式.猫科A_组合_状态.behavior.CanClimb;
import com.uiys.U20_状态模式.猫科A_组合_状态.behavior.CanSwim;
import com.uiys.U20_状态模式.猫科A_组合_状态.behavior.IClimbBehavior;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Lion extends AbstractFeline {

    public Lion() {
        this.setSwim(new CanSwim());
        this.setClimb(new CanClimb());
    }

    /**
     * 可以把是否可以爬树的行为在外面设置
     * @param climbBehavior
     */
    public Lion(IClimbBehavior climbBehavior) {
        setClimb(climbBehavior);
        setSwim(new CanSwim());
    }

    @Override
    public String getName() {
        return "我是狮子";
    }
}


