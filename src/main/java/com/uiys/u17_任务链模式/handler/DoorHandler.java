package com.uiys.u17_任务链模式.handler;

import com.uiys.u17_任务链模式.filter.CarFilter;
import com.uiys.u17_任务链模式.model.CarDomain;
import com.uiys.u17_任务链模式.model.DoorDomain;

import java.util.List;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class DoorHandler extends AbstractHandler<List<CarDomain>, CarFilter> {

    @Override
    public List<CarDomain> filter(CarFilter filter) {
        Boolean includesDoor = filter.includesDoor;
        List<CarDomain> carDomainList = this.getData();
        if (includesDoor) {
            for (CarDomain carDomain : carDomainList) {
                DoorDomain doorDomain = new DoorDomain();
                doorDomain.setDoorName("美凯龙");
                carDomain.setDoor(doorDomain);
            }
        }
        return carDomainList;
    }
}


