package com.uiys.U20_状态模式.开关案例;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class StateTwo extends AbstractState {

    @Override
    public void circleChange(SwitchButton switchButton) {
        System.out.println("I'm stateTwo");
        switchButton.setState(new StateOne());
    }
}


