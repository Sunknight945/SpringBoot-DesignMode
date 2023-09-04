package com.uiys.U15_观察者模式.RSS消息订阅;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author uiys
 * @date 2023/9/5
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CsdnSystem extends AbstractSubscription {

    private String content;

    public CsdnSystem(String content) {
        this.content = content;
    }

    public void setContent(String content){
        this.content = content;
    }

    @Override
    public void publish() {
        notifyRssers(content);
    }
}


