package com.uiys.u17_任务链模式.有逻辑判断的责任链;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Getter
public class DirectLeader extends AbstractHandler {

    @Setter
    private Integer currentDay;
    private static final String DIRECT_LEADER_NAME = "DirectLeader";

    public DirectLeader() {
        this.currentDay = 3;
    }

    @Override
    public void sign(LeaveRequestDomain leaveRequestDomain) {
        Integer requestDayNum = leaveRequestDomain.getRequestDayNum();
        List<String> signList = leaveRequestDomain.getSignList();
        if (requestDayNum >= currentDay) {
            signList.add(DIRECT_LEADER_NAME);
        }
    }



}


