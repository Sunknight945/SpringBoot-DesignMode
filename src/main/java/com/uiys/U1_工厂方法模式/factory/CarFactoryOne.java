package com.uiys.U1_工厂方法模式.factory;

import com.uiys.U1_工厂方法模式.material.ICar;
import com.uiys.U1_工厂方法模式.material.LowCar;
import com.uiys.U1_工厂方法模式.material.MidCar;
import com.uiys.U1_工厂方法模式.material.TopCar;

/**
 * @author uiys
 * @date 2023/9/4
 * 单方法工厂模式
 */
public class CarFactoryOne {

    public ICar createCar(String carLeve) {
        if ("low".equals(carLeve)) {
            return new LowCar();
        } else if ("mid".equals(carLeve)) {
            return new MidCar();
        } else if ("top".equals(carLeve)) {
            return new TopCar();
        } else {
            throw new IllegalStateException("没有合适的车辆等级");
        }
    }

}


