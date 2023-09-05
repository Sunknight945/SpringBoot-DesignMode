package com.uiys.u17_任务链模式.CCCCCC;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        Boss boss = new Boss();
        //先设置好请假审批的先后顺序
        //由直属领导开始，下一个是经理，再下一个是老板
        groupLeader.SetNext(manager);
        manager.SetNext(boss);
        //开始调用请假流程！
        groupLeader.HandleRequest(111);
    }

}


