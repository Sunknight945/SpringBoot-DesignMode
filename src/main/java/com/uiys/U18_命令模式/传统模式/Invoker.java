package com.uiys.U18_命令模式.传统模式;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Invoker {

    private String name;
    private ICommand command;

    public Invoker(String name, ICommand command) {
        this.name = name;
        this.command = command;
    }

    void action() {
        System.out.printf("命令下达者: %s \n", name);
        command.execute();
    }
}


