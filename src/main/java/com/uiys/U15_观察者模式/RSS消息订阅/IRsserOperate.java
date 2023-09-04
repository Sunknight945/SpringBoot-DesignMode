package com.uiys.U15_观察者模式.RSS消息订阅;

/**
 * @author uiys
 * @date 2023/9/5
 */
public interface IRsserOperate {

    void add(IRss iRss);

    void delete(IRss iRss);

    void remove(Long iRssId);

    void notifyRssers(String content);

    void publish();

}
