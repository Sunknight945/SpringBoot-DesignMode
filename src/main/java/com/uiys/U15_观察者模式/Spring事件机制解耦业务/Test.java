package com.uiys.U15_观察者模式.Spring事件机制解耦业务;

import com.uiys.U15_观察者模式.Spring事件机制解耦业务.config.UIYSEventConfig;
import com.uiys.U15_观察者模式.Spring事件机制解耦业务.domain.UserDomain;
import com.uiys.U15_观察者模式.Spring事件机制解耦业务.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(UIYSEventConfig.class);

        UserService userService = context.getBean(UserService.class);
        UserDomain userDomain = new UserDomain();
        userDomain.setName("uiys");
        userDomain.setEmail("123@Gmail.com");
        userService.userRegister(userDomain);

        Thread.sleep(5000);
        context.close();

    }

}


