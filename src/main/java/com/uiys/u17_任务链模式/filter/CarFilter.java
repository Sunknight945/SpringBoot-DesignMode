package com.uiys.u17_任务链模式.filter;

import lombok.Data;

/**
 * @author uiys
 * @date 2023/9/6
 */

@Data
public class CarFilter extends AbstractFilter {

    public Boolean includesWheels;

    public Boolean includesDoor;

    public Boolean includesBackMirrors;

}


