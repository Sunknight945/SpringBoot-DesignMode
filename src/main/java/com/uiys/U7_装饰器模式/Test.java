package com.uiys.U7_装饰器模式;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {
    public static void main(String[] args) {
        DriverBikeDecorator driverBikeDecorator = new DriverBikeDecorator(new IDriverBike());
        driverBikeDecorator.biking();
        driverBikeDecorator.stopping();

        DriverBikeDecorator driverBikeDecorator2 = new DriverBikeDecorator(new OtherDriverBike());
        driverBikeDecorator2.biking();
        driverBikeDecorator2.stopping();


    }

}


