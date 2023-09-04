package com.uiys.U7_装饰器模式;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class DriverBikeDecorator {

    public DriverBike driverBike;

    public DriverBikeDecorator(DriverBike driverBike) {
        this.driverBike = driverBike;
    }

    public void biking() {
        System.out.println("检查了一下车辆情况");
        driverBike.biking();
    }

    public void stopping() {
        System.out.println("捏住了刹车");
        driverBike.stopping();
    }
}


