package com.uiys.U15_观察者模式.Spring事件机制解耦业务.dao;

import com.uiys.U15_观察者模式.Spring事件机制解耦业务.domain.UserDomain;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * @author uiys
 * @date 2023/9/6
 */

@Component
public class UserDao {
    public UserDomain save(UserDomain userDomain) throws InterruptedException {
        userDomain.setId(UUID.randomUUID().toString());
        userDomain.setRegisterTime(new Date());
        // 模拟db的insert操作，假设耗时200ms
        Thread.sleep(200);
        return userDomain;
    }
}


