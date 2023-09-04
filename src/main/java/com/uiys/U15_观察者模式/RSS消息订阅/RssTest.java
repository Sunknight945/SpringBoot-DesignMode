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

}


