package com.uiys.U2_抽象工厂方法.factory;

import com.uiys.U2_抽象工厂方法.material.DaVsCar;
import com.uiys.U2_抽象工厂方法.material.GasEngine;
import com.uiys.U2_抽象工厂方法.material.GuteyiWheels;
import com.uiys.U2_抽象工厂方法.material.ICar;
import com.uiys.U2_抽象工厂方法.material.IEngine;
import com.uiys.U2_抽象工厂方法.material.IWheels;

/**
 * @author uiys
 * @date 2023/9/4
 */
public class DaZhongFactory implements ICarFactory {

    public ICar createCar() {
        ICar davsCar = new DaVsCar();
        IEngine engine = new GasEngine();
        davsCar.addEngine(engine);
        IWheels guteyi = new GuteyiWheels();
        davsCar.putWheels(guteyi);
        return davsCar;
    }

}


