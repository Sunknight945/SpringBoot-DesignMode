package com.uiys.U15_观察者模式.Spring事件监听.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.util.concurrent.TimeUnit;

/**
 * @author uiys
 * @date 2023/9/6
 */

public class TestEvent extends ApplicationEvent {

    @Getter
    private String testEventName;

    public TestEvent(Object source, String testEventName) {
        super(source);
        this.testEventName = testEventName;
    }


}


