package com.uiys.U15_观察者模式.Spring事件机制解耦业务.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class UserRegisterEvent extends ApplicationEvent {

    @Getter
    private String eventName;

    public UserRegisterEvent(Object source, String eventName) {
        super(source);
        this.eventName = eventName;
    }

    /**
     * 由于邮件发送需要事件这里会花去3s.
     */
    public void sendEmail() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("this.source = " + this.source);
        System.out.println("邮件发送成功!");
    }

}


