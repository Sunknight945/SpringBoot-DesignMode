package com.uiys.U20_状态模式.自行车加速减速;

public class TwoGearState extends AGearState {

    @Override
    public void inc(Bike bike) {
        System.out.println("换三档");
        bike.setState(new ThreeGearState());
    }

    @Override
    public void min(Bike bike) {
        System.out.println("换一档");
        bike.setState(new OneGearState());
    }
}


