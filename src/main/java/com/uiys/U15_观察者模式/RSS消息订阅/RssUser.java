package com.uiys.U15_观察者模式.RSS消息订阅;

import lombok.Data;

/**
 * @author uiys
 * @date 2023/9/5
 */
@Data
public class RssUser implements IRss {

    private Long id;
    private String name;

    public RssUser(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void rss(String content) {
        System.out.printf("尊敬的 %s 用户你好,收到一条 <<%s>> 的订阅. \n", this.name, content);
    }
}


