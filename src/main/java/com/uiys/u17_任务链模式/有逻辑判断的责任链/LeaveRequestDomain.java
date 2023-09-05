package com.uiys.u17_任务链模式.有逻辑判断的责任链;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Data
@ToString
public class LeaveRequestDomain {

    private String requestPerson;

    private Integer requestDayNum;

    private List<String> signList;

    public LeaveRequestDomain() {
        this.signList = new ArrayList<>();
    }
}


