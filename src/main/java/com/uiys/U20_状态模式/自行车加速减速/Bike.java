package com.uiys.U20_状态模式.自行车加速减速;

import lombok.Getter;
import lombok.Setter;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Getter
public class Bike {

    @Setter
    private AGearState state;

    public void 加速() {
        state.inc(this);
    }

    public void 减速() {
        state.min(this);
    }

}


