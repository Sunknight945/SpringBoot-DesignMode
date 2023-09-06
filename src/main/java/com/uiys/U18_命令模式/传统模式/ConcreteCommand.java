package com.uiys.U18_命令模式.传统模式;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class ConcreteCommand implements ICommand {

    private String msg;

    private final Receiver receiver;

    public ConcreteCommand(String msg, Receiver receiver) {
        this.msg = msg;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.startCommand(msg);
    }
}


