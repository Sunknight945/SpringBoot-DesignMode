package com.appleyk.DMA2_抽象工厂.keyboard;

import com.appleyk.DMA2_抽象工厂.DM2.IProduceKeyBord;

/**
 * <p>罗技（G）键盘生产商</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:39 2018-11-6
 * @version v0.1.2
 */
public class LuoJiKeyboard implements IProduceKeyBord {
    @Override
    public void produceKeyboard(String name, String color) {
        System.out.println("罗技键盘 -- "+name+","+color);
    }
}

