package com.uiys.U18_命令模式.传统模式;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver("A");
        ConcreteCommand command = new ConcreteCommand("赚钱", receiver);
        Invoker invoker = new Invoker("uiys", command);
        invoker.action();
    }

}


