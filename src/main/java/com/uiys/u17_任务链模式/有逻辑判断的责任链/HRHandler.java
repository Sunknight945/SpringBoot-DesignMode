package com.uiys.u17_任务链模式.有逻辑判断的责任链;

import java.util.List;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class HRHandler extends AbstractHandler{

    @Override
    public void sign(LeaveRequestDomain leaveRequestDomain) {
        List<String> signList = leaveRequestDomain.getSignList();
        signList.add("hr");
    }
}


