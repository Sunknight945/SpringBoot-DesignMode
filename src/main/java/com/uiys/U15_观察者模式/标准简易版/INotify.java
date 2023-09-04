package com.uiys.U15_观察者模式.标准简易版;

/**
 * @author uiys
 * @date 2023/9/5
 */
public interface INotify {

    void add(IObserver observer);

    void extend();

    void notifyObservers();

    void remove(IObserver observer);

}
