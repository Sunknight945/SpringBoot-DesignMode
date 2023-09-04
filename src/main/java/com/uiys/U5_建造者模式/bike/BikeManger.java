package com.uiys.U5_建造者模式.bike;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class BikeManger {

    ZhangSanBike sell(Ibike ibike){
        return ibike.createBike();
    }

}


