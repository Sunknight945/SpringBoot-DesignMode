package com.uiys.U18_命令模式.开关灯;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {
    public static void main(String[] args) {
        /*Integer[] bum = new Integer[2];
        System.out.println(bum);
        bum[0] = 233;
        bum[1] = 244;
        System.out.println(bum[0]);
        System.out.println(bum[1]);*/

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, new LightOnCommand(new BedRoom()),/*new LightOffCommand(new BedRoom())*/null);

        remoteControl.onButtonPushed(0);
        // remoteControl.offButtonPushed(0);
        remoteControl.undoButtonPushed();

    }

}


