package com.uiys.U15_观察者模式.扩展Java事件监听;

import java.util.EventListener;

/**
 * @author uiys
 * @date 2023/9/5
 */
public interface IEventListener<T> extends EventListener {

    void eventChange(T t);

}
