package com.uiys.U2_抽象工厂方法.material;

import lombok.Data;
import lombok.ToString;

/**
 * @author uiys
 * @date 2023/9/4
 */
@Data
@ToString
public class DaVsCar implements ICar {

    private String carName;

    private IEngine iEngine;

    private IWheels iWheels;

    public DaVsCar() {
        this.carName = "大众车";
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
        return "DaVsCar{" + "carName='" + carName + '\'' + ", iEngine=" + iEngine.getEngineName() + ", iWheels=" + iWheels.getWheelsName() + '}';
    }

    @Override
    public void driving() {
        System.out.println(this);
        ;
    }
}


