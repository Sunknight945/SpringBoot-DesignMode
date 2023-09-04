package com.uiys.U1_工厂方法模式.factory;

import com.uiys.U1_工厂方法模式.material.ICar;
import com.uiys.U1_工厂方法模式.material.LowCar;
import com.uiys.U1_工厂方法模式.material.MidCar;
import com.uiys.U1_工厂方法模式.material.TopCar;

/**
 * @author uiys
 * @date 2023/9/4
 * 静态工厂模式 无需创建工程实例
 */
public class CarFactoryTwo {

    public static ICar createLowCar() {
        return new LowCar();
    }

    public static ICar createMidCar() {
        return new MidCar();
    }

    public static ICar createTopCar() {
        return new TopCar();
    }

}


