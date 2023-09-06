package com.uiys.U20_状态模式.猫科A_组合_状态.animal;

import com.uiys.U20_状态模式.猫科A_组合_状态.behavior.IClimbBehavior;
import com.uiys.U20_状态模式.猫科A_组合_状态.behavior.ISwimBehavior;
import lombok.Getter;
import lombok.Setter;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Getter
public abstract class AbstractFeline {

    @Setter
    private IClimbBehavior climb;

    @Setter
    private ISwimBehavior swim;

    public void aboutClimb() {
        String words = getName() + this.climb.climb();
        System.out.println(words);
    }

    public void aboutSwim() {
        String words = getName() + this.swim.swim();
        System.out.println(words);
    }

    public abstract String getName();

}


