package com.uiys.U15_观察者模式.Spring事件监听;

import com.uiys.U15_观察者模式.Spring事件监听.config.SJCOnfig;
import com.uiys.U15_观察者模式.Spring事件监听.event.TestEvent;
import com.uiys.U15_观察者模式.Spring事件监听.listener.SjListenerOne;
import com.uiys.U4_原型模式.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SJCOnfig.class);

        context.addApplicationListener(new SjListenerOne());
        Person person= new Person();
        person.setAge(20);
        context.publishEvent(new TestEvent(new Object(),"这是个神马事件?"));
        context.publishEvent(new TestEvent(person,"这是个神马事件?"));



    }
}


