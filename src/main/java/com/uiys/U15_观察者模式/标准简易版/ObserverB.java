package com.uiys.U15_观察者模式.标准简易版;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class ObserverB implements IObserver {

    @Override
    public void discover() {
        System.out.println("观察者B, 发现敌情!");
    }
}


