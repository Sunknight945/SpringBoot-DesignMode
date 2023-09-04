package com.uiys.U15_观察者模式.RSS消息订阅;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class RssTest {
    public static void main(String[] args) {
        CsdnSystem iRsserOperate = new CsdnSystem("发现通灵宝物一份!");
        iRsserOperate.add(new RssUser(1L, "韩天尊"));
        iRsserOperate.add(new RssUser(2L, "历飞雨"));
        iRsserOperate.add(new RssUser(3L, "蟹道人"));
        iRsserOperate.publish();
        System.out.println("=========");
        System.out.println("此时蟹道人退出去了");
        iRsserOperate.remove(3L);
        iRsserOperate.setContent("快跑");
        iRsserOperate.publish();

    }
    /**
     * 百科如下描述观察者模式：
     * 观察者模式（有时又被称为发布/订阅模式）是软件设计模式的一种。
     * 在此种模式中，一个目标对象管理所有相依于它的观察者对象，并且在它本身的状态改变时主动发出通知。
     * 这通常透过呼叫各观察者所提供的方法来实现。此种模式通常被用来实现事件处理系统。
     *
     * 看了解释，主要记住这句话就行了，又被称为发布/订阅模式
     * 优点如下：
     * （1）主要或目标对象与被观察之间是完全解耦的，因此二者很容易被扩展
     * （2）主对象可以将改变的状态结果通过链条的形式传递给依赖于其的所有被观察者对象，
     *      大大节省了通知的代码量（否则需要人工去一个个通知）
     * 缺点如下：
     *      由于观察者的数量不定，如果数量过大的话，链式的通知方法会严重影响性能！！！
     * 观察者和中介者模式很像，都是处理一对多的情况，但是两者是有区别的“
     * 观察者模式：只能从一方到另一方循环的通知，属于单向。（好比上课，只能老实授课给班上所有的学生，反过来不行）
     * 中介者模式：可以从任一一方循环通知，属于双向。（好比分享会，每个人都可以分享自己的事情给别人）
     * 总结：
     * 观察者和中介者相同点：
     * 1：都属于行为型模式
     * 2：都为了处理一对多的关系
     * 3：UML实现基本相同，都有集合管理业务对象的集合，都有循环通知的方法，符合单一职责原则。
     * 观察者和中介者不同点：使用场景不同，观察者属于单向，中介者属于双向。
     */
}


