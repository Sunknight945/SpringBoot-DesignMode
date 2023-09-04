package com.uiys.U15_观察者模式.扩展Java事件监听;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class MyEventSource {

    private MyEvent event;

    private List<IEventListener> listeners;

    public MyEventSource() {
        event = new MyEvent(this, 1);
        listeners = Collections.synchronizedList(new ArrayList<>());
    }

    public void publish() {
        for (IEventListener listener : listeners) {
            listener.eventChange(event);
        }
    }

    public void addListener(IEventListener eventListener) {
        this.listeners.add(eventListener);
    }

    public void setVal(Integer val) {
        event.setVal(val);
        publish();
    }

}


