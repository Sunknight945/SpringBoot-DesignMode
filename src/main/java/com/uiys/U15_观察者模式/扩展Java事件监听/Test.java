package com.uiys.U15_观察者模式.扩展Java事件监听;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {
    public static void main(String[] args) {
        MyEventSource myEventSource = new MyEventSource();
        myEventSource.addListener(new MyListener());
        myEventSource.addListener(new MyListenerU());
        myEventSource.setVal(3);
        myEventSource.setVal(2);
        myEventSource.setVal(1);
    }

}


