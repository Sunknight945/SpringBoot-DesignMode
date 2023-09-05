package com.uiys.u17_任务链模式.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Data
@ToString
public class CarDomain {

    private String carName;

    private DoorDomain door;

    private WheelsDomain wheels;

}


