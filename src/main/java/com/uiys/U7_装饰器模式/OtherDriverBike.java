package com.uiys.U7_装饰器模式;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class OtherDriverBike implements DriverBike{

    @Override
    public void biking() {
        System.out.println("其他人骑车");
    }

    @Override
    public void stopping() {
        System.out.println("其他人停车");
    }
}


