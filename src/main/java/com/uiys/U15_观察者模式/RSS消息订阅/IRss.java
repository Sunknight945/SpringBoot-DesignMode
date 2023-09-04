package com.uiys.U15_观察者模式.RSS消息订阅;

/**
 * @author uiys
 * @date 2023/9/5
 */
public interface IRss {

    /**
     * 消息订阅，主要输出订阅的内容
     *
     * @param content 消息内容
     */
    void rss(String content);

}
