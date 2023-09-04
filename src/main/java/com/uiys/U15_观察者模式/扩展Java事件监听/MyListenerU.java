package com.uiys.U15_观察者模式.扩展Java事件监听;

public class MyListenerU implements IEventListener<MyEvent> {

    public void eventChange(MyEvent event) {
        System.out.println("调用了eventChanged方法，event = " + event + ",val = " + event.getVal());
    }
}
