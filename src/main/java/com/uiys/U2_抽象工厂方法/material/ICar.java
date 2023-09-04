package com.uiys.U2_抽象工厂方法.material;

import lombok.Data;

/**
 * @author uiys
 * @date 2023/9/4
 */
public interface ICar {

    void addEngine(IEngine iEngine);

    void useEngine(IEngine iEngine);

    void putWheels(IWheels iWheels);

    void driving();

}
