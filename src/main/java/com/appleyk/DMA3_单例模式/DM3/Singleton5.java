package com.appleyk.DMA3_单例模式.DM3;

/**
 * <p>DCL（双重检查锁）单例模式 -- 线程安全，只在第一次创建实例的时候加锁</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:12 2018-11-6
 * @version v0.1.2
 */
public final class Singleton5 {

    // 私有构造器，防止外部new实例
    private Singleton5(){}

    // 加volatile，防止指令重排序
    private static volatile Singleton5 instance = null;

    /**
     * 区别于Singleton2,注意synchronized关键字【同步块】的位置
     */
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class){
                if(instance == null){
                    /**
                     * 对象new的过程对应的JVM字节码核心有以下几步
                     *
                     * 1、给instance分配内存空间
                     * 2、调用instance的构造器
                     * 3、将instance对象指向分配的内存空间
                     *
                     * 但是JVM为了优化指令，提高程序运行效率，允许指令重排序，所以上面的命令真正执行时可能下面的这种
                     *
                     * 1、给instance分配内存空间
                     * 2、将instance对象指向分配的内存空间 （如果线程A刚好执行完这个准备执行3）
                     * 3、调用instance的构造器
                     *
                     * 并发下，线程B最外层判断，因为instance已经指向了一块内存区域所以不为null，直接返回了
                     * 但是线程B拿到的是没有初始化的instance对象，使用未初始化的对象必然会报错的！
                     * synchronized保证了线程的原子性但无法保证指令的原子性，所以需要在instance上使用volatile来禁止指令重排
                     */
                    instance = new Singleton5();
                }
                return instance;
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("你好，我是单例模式五！");
    }

}
