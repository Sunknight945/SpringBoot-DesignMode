package com.uiys.U15_观察者模式.删除.需要删除的2;

import java.util.concurrent.TimeUnit;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class JobListenerA implements IJobListener {

    @Override
    public void processOn(JobDomain job) {
        System.out.println(job.getJobName() + "执行中,已花时间:" + job.getCostTime());
        if (Double.valueOf(job.getCostTime()).compareTo(4.0) < 0) {
            try {
                TimeUnit.MILLISECONDS.sleep(450);
                processOn(job);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void successOn(JobDomain job) {
        job.jobFinished();
        System.out.println(job.getJobName() + "执行成功,已花时间:" + job.getCostTime());
    }

    @Override
    public void failOn(JobDomain job, Throwable throwable) {
        System.out.println(job.getJobName() + "执行失败,已花时间:" + job.getCostTime());
    }
}


