package com.uiys.u17_任务链模式.有逻辑判断的责任链;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Getter
public abstract class AbstractHandler {


    @Setter
    public Integer currentDay;

    @Setter
    public AbstractHandler nextHandler;

    public Boolean canHandler(LeaveRequestDomain leaveRequestDomain) {
        boolean cc = Boolean.FALSE;
        AbstractHandler nextHandler1 = this;
        while (Objects.nonNull(nextHandler1)) {
            Integer currentDay1 = nextHandler1.getCurrentDay();
            if (currentDay1 >= leaveRequestDomain.getRequestDayNum()) {
                cc = Boolean.TRUE;
                break;
            }
            nextHandler1 = nextHandler1.getNextHandler();
        }
        return cc;
    }

    public void process(LeaveRequestDomain leaveRequestDomain) {
        Boolean b = canHandler(leaveRequestDomain);
        if (!b) {
            System.out.println("太久,无人审批!");
            return;
        }
        AbstractHandler nextHandler = this;
        while (Objects.nonNull(nextHandler)) {
            nextHandler.sign(leaveRequestDomain);
            nextHandler = nextHandler.getNextHandler();
        }
    }

    public abstract void sign(LeaveRequestDomain leaveRequestDomain);

}


