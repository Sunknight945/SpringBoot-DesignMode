package com.uiys.U6_适配器模式.鸭鹅鸡适配器;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class 天鹅 implements Quackable {

    /**
     *
     */
    @Override
    public void quack() {
        System.out.println("天鹅叫: 欧欧 欧欧!");
    }
}


