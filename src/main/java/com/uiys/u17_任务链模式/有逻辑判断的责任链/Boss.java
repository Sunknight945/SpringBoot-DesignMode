package com.uiys.u17_任务链模式.有逻辑判断的责任链;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class Boss extends AbstractHandler {
    @Setter
    private   Integer currentDay ;

    public Boss() {
        this.currentDay = 7;
    }

    @Override
    public void sign(LeaveRequestDomain leaveRequestDomain) {
        Integer requestDayNum = leaveRequestDomain.getRequestDayNum();
        List<String> signList = leaveRequestDomain.getSignList();
        if (requestDayNum >= currentDay) {
            String directLeaderName = "Boss";
            signList.add(directLeaderName);
        }
    }
}


