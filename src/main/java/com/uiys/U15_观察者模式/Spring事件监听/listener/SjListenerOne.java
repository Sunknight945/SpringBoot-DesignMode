package com.uiys.U15_观察者模式.Spring事件监听.listener;

import com.uiys.U15_观察者模式.Spring事件监听.event.TestEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class SjListenerOne implements ApplicationListener<TestEvent> {

    @Override
    public void onApplicationEvent(TestEvent event) {
        System.out.printf("事件名称:%s, 事件内容:%s \n", event.getTestEventName(), event.getSource());
    }
}


