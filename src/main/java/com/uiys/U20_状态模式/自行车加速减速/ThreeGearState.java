package com.uiys.U20_状态模式.自行车加速减速;

public class ThreeGearState extends AGearState {

    @Override
    public void inc(Bike bike) {
        System.out.println("加不了");
    }

    @Override
    public void min(Bike bike) {
        System.out.println("换二档");
        bike.setState(new TwoGearState());
    }
}


