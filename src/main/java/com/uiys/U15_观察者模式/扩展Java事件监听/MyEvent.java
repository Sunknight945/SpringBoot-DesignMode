package com.uiys.U15_观察者模式.扩展Java事件监听;

import lombok.Data;

import java.util.EventObject;

/**
 * @author uiys
 * @date 2023/9/5
 */

public class MyEvent extends EventObject {

    private Integer val;

    public MyEvent(Object source, Integer val) {
        super(source);
        this.val = val;
    }

    public Integer getVal(){
        return val;
    }

    public void setVal(Integer val){
        this.val = val;
    }

}


