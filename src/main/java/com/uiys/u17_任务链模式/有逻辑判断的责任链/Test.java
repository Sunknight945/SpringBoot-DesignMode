package com.uiys.u17_任务链模式.有逻辑判断的责任链;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {
    public static void main(String[] args) {
        DirectLeader directLeader = new DirectLeader();
        DeptLeader deptLeader = new DeptLeader();
        Boss boss = new Boss();
        HRHandler hrHandler = new HRHandler();
        directLeader.setNextHandler(deptLeader);
        deptLeader.setNextHandler(boss);
        boss.setNextHandler(hrHandler);

        LeaveRequestDomain leaveRequestDomain = new LeaveRequestDomain();
        leaveRequestDomain.setRequestPerson("ui");
        leaveRequestDomain.setRequestDayNum(7);

        directLeader.process(leaveRequestDomain);
        System.out.println(leaveRequestDomain);

    }

}


