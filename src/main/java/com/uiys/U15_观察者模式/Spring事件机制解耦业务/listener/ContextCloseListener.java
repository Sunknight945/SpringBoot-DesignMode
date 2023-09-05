package com.uiys.U15_观察者模式.Spring事件机制解耦业务.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;
/**
 * @author uiys
 */
@Component
public class ContextCloseListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("========== Spring IOC 容器成功销毁，程序退出！ ==========");
    }
}
