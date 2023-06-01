package com.appleyk.DMA3_单例模式.DM3;

/**
 * <p>单例模式 -- 线程安全（线程拿到的就是已经实例化过的）</p>
 * 饿汉模式
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:12 2018-11-6
 * @version v0.1.2
 */
public final class Singleton7 {

    // 私有构造器，防止外部new实例
    private Singleton7(){}

    private static Singleton7 instance = new Singleton7();

    public static Singleton7 getInstance() {
        return instance;
    }

    public void show(){
        System.out.println("你好，我是单例模式七！");
    }

}
