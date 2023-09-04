package com.uiys.U5_建造者模式.bike;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {

    public static void main(String[] args) {
        BikeManger bikeManger = new BikeManger();
        ZhangSanBike sell = bikeManger.sell(new ZhangSanBike());
        System.out.println(sell.getCreateName());
    }

}


