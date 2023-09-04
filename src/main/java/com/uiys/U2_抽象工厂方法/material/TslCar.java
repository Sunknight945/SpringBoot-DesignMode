package com.uiys.U2_抽象工厂方法.material;

import jdk.nashorn.internal.runtime.regexp.joni.constants.TargetInfo;
import lombok.Data;

/**
 * @author uiys
 * @date 2023/9/4
 */
@Data
public class TslCar implements ICar {

    private String carName;

    private IEngine iEngine;

    private IWheels iWheels;

    public TslCar() {
        this.carName = "特斯拉车";
    }

    @Override
    public void addEngine(IEngine iEngine) {
        System.out.println(iEngine.getEngineName());
        this.iEngine = iEngine;
    }

    @Override
    public void useEngine(IEngine iEngine) {
        System.out.println(iEngine.getEngineName());
    }

    @Override
    public void putWheels(IWheels iWheels) {
        System.out.println(iWheels.getWheelsName());
        this.iWheels = iWheels;
    }

    @Override
    public String toString() {
        return "TslCar{" + "carName='" + carName + '\'' + ", iEngine=" + iEngine.getEngineName() + ", iWheels=" + iWheels.getWheelsName() + '}';
    }

    @Override
    public void driving() {
        System.out.println(this);
    }
}


