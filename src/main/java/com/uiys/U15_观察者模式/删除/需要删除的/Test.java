package com.uiys.U15_观察者模式.删除.需要删除的;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        StandJob 一个任务 = new StandJob("233L", 0, "一个任务", 1024L * 1024L * 24, 0L);
        List<IJobListener> jobListeners = new ArrayList<>();
        jobListeners.add(new MJobListener());
        jobListeners.add(new MJobListener233());
        Thread thread = new Thread(new JobTable(new JobDDDD(一个任务), jobListeners), "啊啊");
        thread.start();
        thread.join();

        System.out.println("任务名称：" + 一个任务.getJobName() + "传输结束，任务状态：" + 一个任务.getJobStatus());

    }

}


