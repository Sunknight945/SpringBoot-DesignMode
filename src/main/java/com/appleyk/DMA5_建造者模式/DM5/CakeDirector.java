package com.appleyk.DMA5_建造者模式.DM5;

/**
 * <p>蛋糕管理者 == 告诉蛋糕师，货架上没蛋糕了，赶紧给我做一个出来，客户等着要呢</p>
 *
 * @author Appleyk
 * @version v0.1.2
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 2:02 2018-11-9
 */
public class CakeDirector {

    public CakeDirector() {
    }

    public Cake sell(ICakeBuilder cakeBuilder) {
        /**
         * 不要在当前的类里去调用cakeBuilder的方法去构建cake，这违反了设计原则里面的迪米特法则
         * 正确的做法是将下面这段代码放到属于它的类的方法中
         * 迪米特法则：一个类对另一个类知道的越少越好，降低类与类之间的耦合度！
         */
//        cakeBuilder.knead();
//        cakeBuilder.ferment();
//        cakeBuilder.bake(30);
        /**通知糕点师傅订单来了，赶紧做*/
        return cakeBuilder.getCake();
    }

}
