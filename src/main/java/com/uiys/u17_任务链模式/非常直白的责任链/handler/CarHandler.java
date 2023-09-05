package com.uiys.u17_任务链模式.非常直白的责任链.handler;

import com.uiys.u17_任务链模式.非常直白的责任链.filter.CarFilter;
import com.uiys.u17_任务链模式.非常直白的责任链.model.CarDomain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class CarHandler extends AbstractHandler<List<CarDomain>, CarFilter> {

    @Override
    public List<CarDomain> filter(CarFilter filter) {
        List<CarDomain> carDomains = new ArrayList<>();
        for (String id : filter.ids) {
            CarDomain carDomain = new CarDomain();
            carDomain.setCarName(id);
            carDomains.add(carDomain);
        }
        return carDomains;
    }
}


