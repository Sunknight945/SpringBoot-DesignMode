package com.uiys.U15_观察者模式.Spring事件监听.listener;

import com.uiys.U15_观察者模式.Spring事件监听.event.TestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Component
public class SjListenerTwo {

    private static final String name = "SjListenerTwo";

    @EventListener
    public void handler(TestEvent event) {
        System.out.printf("事件名称:%s, 事件内容:%s  来自监听器:%s \n", event.getTestEventName(), event.getSource(), name);
    }

    public String name() {
        return name;
    }
}


