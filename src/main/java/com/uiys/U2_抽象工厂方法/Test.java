package com.uiys.U2_抽象工厂方法;

import com.uiys.U2_抽象工厂方法.factory.DaZhongFactory;
import com.uiys.U2_抽象工厂方法.factory.ICarFactory;
import com.uiys.U2_抽象工厂方法.factory.TeslaFactory;
import com.uiys.U2_抽象工厂方法.material.ICar;

/**
 * @author uiys
 * @date 2023/9/4
 */
public class Test {
    public static void main(String[] args) {
        ICarFactory daVsF = new DaZhongFactory();
        ICar dCar = daVsF.createCar();
        dCar.driving();

        ICarFactory tslF = new TeslaFactory();
        ICar tCar = tslF.createCar();
        tCar.driving();


    }

}


