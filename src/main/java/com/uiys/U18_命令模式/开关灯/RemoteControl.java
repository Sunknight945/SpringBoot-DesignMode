package com.uiys.U18_命令模式.开关灯;

/**
 * 遥控器 相当于CMD模式中的 [invoker]
 *
 * @author uiys
 * @date 2023/9/6
 */
public class RemoteControl {

    /**
     * 遥控器按钮, 不同的槽位, 实现不同对象的开闭操做, 开电视机, 开卧室的灯等
     */
    private ICommand[] OnCommand;

    /**
     * 遥控器按钮, 不同的槽位,
     * 实现不对象的关闭操作.
     */
    private ICommand[] OffCommand;

    /**
     * 撤销操做需要记录最后一个命令是什么
     */
    private ICommand undoCommand;

    public RemoteControl() {
        OnCommand = new ICommand[1];
        OnCommand[0] = new NoCommand();

        OffCommand = new ICommand[1];
        OffCommand[0] = new NoCommand();
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        OnCommand[slot] = onCommand;
        OffCommand[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        OnCommand[slot].execute();
        undoCommand = OnCommand[slot];
    }

    public void offButtonPushed(int slot) {
        OffCommand[slot].execute();
        undoCommand = OffCommand[slot];
    }

    public void undoButtonPushed() {
        System.out.println("=====> 你按下了撤销按钮");
        undoCommand.execute();
    }

}


