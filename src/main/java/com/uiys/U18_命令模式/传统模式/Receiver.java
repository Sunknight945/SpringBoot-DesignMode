package com.uiys.U18_命令模式.传统模式;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Receiver {

    private String name;


    public Receiver(String name) {
        this.name = name;
    }

    public void startCommand(String command) {
        System.out.printf("接收者: %s , 收到 [%s] 命令!",name,command);
    }

}


