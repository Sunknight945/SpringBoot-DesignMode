package com.uiys.U15_观察者模式.RSS消息订阅;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author uiys
 * @date 2023/9/5
 */
public abstract class AbstractSubscription implements IRsserOperate {

    private List<IRss> iRssList = new ArrayList<>(8);

    @Override
    public void add(IRss iRss) {
        iRssList.add(iRss);
    }

    @Override
    public void delete(IRss iRss) {
        RssUser iRss1 = (RssUser)iRss;
        if (Objects.nonNull(iRss1.getId())) {
            remove(iRss1.getId());
        }
    }

    @Override
    public void remove(Long id) {
        Iterator<IRss> iterator = iRssList.iterator();
        while (iterator.hasNext()) {
            RssUser next = (RssUser)iterator.next();
            if (next.getId().equals(id)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void notifyRssers(String content) {
        System.out.printf("正在发送content:%s \n", content);
        for (IRss iRss : iRssList) {
            iRss.rss(content);
        }
    }

}


