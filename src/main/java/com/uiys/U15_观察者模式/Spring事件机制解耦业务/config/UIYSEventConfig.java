package com.uiys.U15_观察者模式.Spring事件机制解耦业务.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author uiys
 * @date 2023/9/6
 */
@Configuration
@EnableAsync // 开启异步
@ComponentScan("com.uiys.U15_观察者模式.Spring事件机制解耦业务")
public class UIYSEventConfig {

    //配置线程池(事件的异步会用到)
    @Bean
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setThreadNamePrefix("task-");
        // 任务拒绝执行策略（如果超过了最大线程数，就会触发拒绝执行策略，一共四种，默认抛异常）
        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();
        taskExecutor.setRejectedExecutionHandler(handler);
        // 核心线程数（如果不够，就创建新的线程）
        taskExecutor.setCorePoolSize(5);
        // 队列容量（可以是无界也可以是有界，如果超过了核心线程数，就往任务队列里扔）
        taskExecutor.setQueueCapacity(20);
        // 最大承受（可以new）的线程数（如果任务队列满了，就创建新的线程）
        taskExecutor.setMaxPoolSize(15);
        taskExecutor.initialize();
        System.out.println("taskExecutor = " + taskExecutor);
        return taskExecutor;
    }

}


