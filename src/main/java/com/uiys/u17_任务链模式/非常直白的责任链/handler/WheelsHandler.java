package com.uiys.u17_任务链模式.非常直白的责任链.handler;

import com.uiys.u17_任务链模式.非常直白的责任链.filter.CarFilter;
import com.uiys.u17_任务链模式.非常直白的责任链.model.CarDomain;
import com.uiys.u17_任务链模式.非常直白的责任链.model.WheelsDomain;

import java.util.List;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class WheelsHandler extends AbstractHandler<List<CarDomain>, CarFilter> {

    @Override
    public List<CarDomain> filter(CarFilter filter) {
        List<CarDomain> carDomainList = this.getData();
        if(filter.includesWheels){
            for (CarDomain carDomain : carDomainList) {
                WheelsDomain wheelsDomain = new WheelsDomain();
                wheelsDomain.setWheelsName("米其林");
                carDomain.setWheels(wheelsDomain);
            }
        }
        return carDomainList;
    }
}


