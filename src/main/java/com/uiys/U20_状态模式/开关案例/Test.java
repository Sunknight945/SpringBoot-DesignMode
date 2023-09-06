package com.uiys.U20_状态模式.开关案例;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {
    public static void main(String[] args) {
        SwitchButton switchButton = new SwitchButton();
        switchButton.setState(new StateOne());
        switchButton.change();
        switchButton.change();
        switchButton.change();
        switchButton.change();
        switchButton.change();
        switchButton.change();
        switchButton.change();
        switchButton.change();
    }

}


