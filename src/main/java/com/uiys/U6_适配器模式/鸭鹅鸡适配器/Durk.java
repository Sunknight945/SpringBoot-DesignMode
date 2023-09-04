package com.uiys.U6_适配器模式.鸭鹅鸡适配器;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Durk implements Quackable {

    @Override
    public void quack() {
        System.out.println("鸭子 叫: 嘎嘎 嘎嘎");
    }
}


