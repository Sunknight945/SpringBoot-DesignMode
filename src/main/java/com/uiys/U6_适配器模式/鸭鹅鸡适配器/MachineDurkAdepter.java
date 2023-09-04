package com.uiys.U6_适配器模式.鸭鹅鸡适配器;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class MachineDurkAdepter implements Quackable {

    private MachineDurk machineDurk;

    public MachineDurkAdepter(MachineDurk machineDurk) {
        this.machineDurk = machineDurk;
    }

    /**
     *
     */
    @Override
    public void quack() {
        machineDurk.play();
    }
}


