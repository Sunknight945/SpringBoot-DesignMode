package com.uiys.U15_观察者模式.删除.需要删除的2;

import java.util.concurrent.TimeUnit;

public class JobListenerA233 implements IJobListener {

    @Override
    public void processOn(JobDomain job) {
        if (job.getProcessNum() > 10) {
            throw new RuntimeException("调用链太长 from 233");
        }
        System.out.println(job.getJobName() + "执行中,已花时间:" + job.getCostTime() + "     233");
        Integer sss = 0;
        while (!sss.equals(job.getProcessNum())) {
            try {
                TimeUnit.MILLISECONDS.sleep(450);
                job.setProcessNum(job.getProcessNum() - 1);
                processOn(job);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void successOn(JobDomain job) {
        job.jobFinished();
        System.out.println(job.getJobName() + "执行成功,已花时间:" + job.getCostTime() + "     233");
    }

    @Override
    public void failOn(JobDomain job, Throwable throwable) {
        System.out.println(job.getJobName() + "执行失败,已花时间:" + job.getCostTime() + "     233"+ throwable.getMessage());
    }
}

