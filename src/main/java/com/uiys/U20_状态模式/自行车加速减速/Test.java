package com.uiys.U20_状态模式.自行车加速减速;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setState(new OneGearState());
        bike.加速();
        bike.加速();
        bike.加速();
        bike.加速();
        bike.减速();
        bike.减速();
        bike.减速();
        bike.减速();
        bike.加速();
    }

}


