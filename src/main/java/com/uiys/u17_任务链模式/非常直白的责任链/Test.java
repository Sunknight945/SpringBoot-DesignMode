package com.uiys.u17_任务链模式.非常直白的责任链;

import com.uiys.u17_任务链模式.非常直白的责任链.filter.CarFilter;
import com.uiys.u17_任务链模式.非常直白的责任链.handler.AbstractHandler;
import com.uiys.u17_任务链模式.非常直白的责任链.handler.CarHandler;
import com.uiys.u17_任务链模式.非常直白的责任链.handler.DoorHandler;
import com.uiys.u17_任务链模式.非常直白的责任链.handler.WheelsHandler;
import com.uiys.u17_任务链模式.非常直白的责任链.model.CarDomain;

import java.util.Arrays;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {
    public static void main(String[] args) {
        CarFilter carFilter = new CarFilter();
        carFilter.setIds(Arrays.asList("1", "2", "3"));
        carFilter.setIncludesDoor(Boolean.TRUE);
        carFilter.setIncludesWheels(Boolean.TRUE);

        AbstractHandler carHandler = new CarHandler();
        AbstractHandler carHandler2 = new DoorHandler();
        AbstractHandler carHandler3 = new WheelsHandler();
        carHandler.setNextHandler(carHandler2);
        carHandler2.setNextHandler(carHandler3);
        AbstractHandler<List<CarDomain>, CarFilter> fas = new CarHandler();
        List<CarDomain> process = (List<CarDomain>)fas.process(carHandler, carFilter);
        System.out.println(process);

    }

}


