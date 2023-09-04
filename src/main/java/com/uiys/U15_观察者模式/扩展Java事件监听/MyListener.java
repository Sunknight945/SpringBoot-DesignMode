package com.uiys.U15_观察者模式.扩展Java事件监听;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class MyListener implements IEventListener<MyEvent> {

    public void eventChange(MyEvent event) {
        System.out.println("调用了eventChanged方法，event = " + event + ",val = " + event.getVal());
    }
}


