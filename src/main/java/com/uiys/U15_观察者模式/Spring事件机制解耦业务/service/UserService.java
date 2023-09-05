package com.uiys.U15_观察者模式.Spring事件机制解耦业务.service;

import com.uiys.U15_观察者模式.Spring事件机制解耦业务.dao.UserDao;
import com.uiys.U15_观察者模式.Spring事件机制解耦业务.domain.UserDomain;
import com.uiys.U15_观察者模式.Spring事件机制解耦业务.event.UserRegisterEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Service
public class UserService implements ApplicationContextAware {

    @Resource
    UserDao userDao;

    ApplicationContext context;



    public void userRegister(UserDomain userDomain) throws InterruptedException {
        UserDomain user = userDao.save(userDomain);
        UserRegisterEvent 注册事件 = new UserRegisterEvent(user, "注册事件");
        context.publishEvent(注册事件);



    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}


