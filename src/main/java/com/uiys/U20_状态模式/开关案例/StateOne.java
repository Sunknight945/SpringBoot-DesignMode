package com.uiys.U20_状态模式.开关案例;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class StateOne extends AbstractState {

    @Override
    public void circleChange(SwitchButton switchButton) {
        System.out.println("I'm StateOne");
        switchButton.setState(new StateTwo());
    }
}


