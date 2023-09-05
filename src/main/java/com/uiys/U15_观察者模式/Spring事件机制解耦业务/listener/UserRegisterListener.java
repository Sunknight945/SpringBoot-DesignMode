package com.uiys.U15_观察者模式.Spring事件机制解耦业务.listener;

import com.uiys.U15_观察者模式.Spring事件机制解耦业务.domain.UserDomain;
import com.uiys.U15_观察者模式.Spring事件机制解耦业务.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author uiys
 * @date 2023/9/6
 */
// @Component
// public class UserRegisterListener implements ApplicationListener<UserRegisterEvent> {
//
//     @Override
//     public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
//         UserDomain source = (UserDomain)userRegisterEvent.getSource();
//         try {
//             userRegisterEvent.sendEmail();
//         } catch (InterruptedException e) {
//             throw new RuntimeException(e);
//         }
//         System.out.printf("收到 %s 事件, 内容为:%s%n", userRegisterEvent.getEventName(), source.toString());
//     }
// }

@Component
public class UserRegisterListener {

    @EventListener
    @Async // 开启异步执行需要线程池的支持
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        UserDomain source = (UserDomain)userRegisterEvent.getSource();
        try {
            userRegisterEvent.sendEmail();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("收到 %s 事件, 内容为:%s%n", userRegisterEvent.getEventName(), source.toString());
    }

}


