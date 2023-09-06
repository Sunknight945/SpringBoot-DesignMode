package com.uiys.U18_命令模式.开关灯;

import lombok.Setter;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class LightOffCommand implements ICommand {

    @Setter
    private BedRoom bedRoom;

    public LightOffCommand(BedRoom bedRoom) {
        this.bedRoom = bedRoom;
    }

    @Override
    public void execute() {
        bedRoom.off();
    }

    @Override
    public void undo() {
        bedRoom.on();
    }
}


