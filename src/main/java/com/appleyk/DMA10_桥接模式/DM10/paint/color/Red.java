package com.appleyk.DMA10_桥接模式.DM10.paint.color;

/**
 * <p>红色</p>
 *
 * @author Appleyk
 * @version v0.1.2
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:23 2018-11-19
 */
public class Red implements Color {
    @Override
    public void painting(String shape) {
        System.out.println("绘制红色的" + shape);
    }
}
