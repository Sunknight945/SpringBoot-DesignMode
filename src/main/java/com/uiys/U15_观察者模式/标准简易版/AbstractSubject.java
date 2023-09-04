package com.uiys.U15_观察者模式.标准简易版;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/5
 * 抽象的订阅者
 */
public abstract class AbstractSubject implements INotify {

    private List<IObserver> iObserverList = new ArrayList<>(8);

    protected AbstractSubject() {
        this.iObserverList = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        iObserverList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        iObserverList.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("前方有敌人!");
        for (IObserver iObserver : iObserverList) {
            iObserver.discover();
        }
    }

}


