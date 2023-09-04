package com.uiys.U2_抽象工厂方法.factory;

import com.uiys.U2_抽象工厂方法.material.ElectricityEngine;
import com.uiys.U2_抽象工厂方法.material.ICar;
import com.uiys.U2_抽象工厂方法.material.IEngine;
import com.uiys.U2_抽象工厂方法.material.IWheels;
import com.uiys.U2_抽象工厂方法.material.MaPaiWheels;
import com.uiys.U2_抽象工厂方法.material.TslCar;

/**
 * @author uiys
 * @date 2023/9/4
 */
public class TeslaFactory implements ICarFactory {

    @Override
    public ICar createCar() {
        ICar tslCar = new TslCar();
        IEngine electricityEngine = new ElectricityEngine();
        tslCar.addEngine(electricityEngine);
        IWheels mapaiWheels = new MaPaiWheels();
        tslCar.putWheels(mapaiWheels);
        return tslCar;
    }
}


