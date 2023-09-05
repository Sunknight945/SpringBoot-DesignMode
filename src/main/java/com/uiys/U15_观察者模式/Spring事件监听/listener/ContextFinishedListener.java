package com.uiys.U15_观察者模式.Spring事件监听.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * <p>Spring上下文完成刷新（配置、加载bean定义、创建bean实例等等）监听器</p>
 *
 * @author uiys
 * @date 2023/9/6
 */
@Component
public class ContextFinishedListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // 这个方法里面可以干很多很多事情，比如拿到context，你可以进行下面的操作
        System.out.println("event = " + event);
        ApplicationContext applicationContext = event.getApplicationContext();
        System.out.println("applicationContext.getBean(SjListenerTwo.class).name() = " + applicationContext.getBean(SjListenerTwo.class).name());
        System.out.println("==================== 分割线 ========================");
        System.out.println("Hi man，You can have fun using the Spring Framework");
    }
}


