package com.uiys.U20_状态模式.自行车加速减速;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class OneGearState extends AGearState {

    @Override
    public void inc(Bike bike) {
        System.out.println("换二档");
        bike.setState(new TwoGearState());
    }

    @Override
    public void min(Bike bike) {
        System.out.println("停下了");
    }
}


