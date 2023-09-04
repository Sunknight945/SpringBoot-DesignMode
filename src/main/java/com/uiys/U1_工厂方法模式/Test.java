package com.uiys.U1_工厂方法模式;

import com.uiys.U1_工厂方法模式.factory.CarFactoryOne;
import com.uiys.U1_工厂方法模式.factory.CarFactoryTwo;
import com.uiys.U1_工厂方法模式.material.ICar;

/**
 * @author uiys
 * @date 2023/9/4
 */
public class Test {
    public static void main(String[] args) {
        CarFactoryOne carFactoryOne = new CarFactoryOne();
        ICar top = carFactoryOne.createCar("top");
        top.run(999.0);

        ICar midCar = CarFactoryTwo.createMidCar();
        midCar.run(999.9);
    }

}


