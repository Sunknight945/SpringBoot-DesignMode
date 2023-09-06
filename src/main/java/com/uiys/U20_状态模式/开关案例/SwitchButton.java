package com.uiys.U20_状态模式.开关案例;

import lombok.Getter;
import lombok.Setter;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Getter
public class SwitchButton {

    @Setter
    public AbstractState state;

    public void change() {
        state.circleChange(this);
    }

}


