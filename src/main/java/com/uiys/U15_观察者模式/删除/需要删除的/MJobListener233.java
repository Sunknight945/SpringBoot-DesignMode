package com.uiys.U15_观察者模式.删除.需要删除的;

public class MJobListener233 implements IJobListener {

    @Override
    public void onFail(StandJob job, Throwable throwable) {
        System.out.println(job.getJobName() + "MJobListener233执行失败, id 为:" + job.getJobId() + "完成度为:" + job.getProcessPercent());
        System.out.print(throwable);
    }

    @Override
    public void onSuccess(StandJob job) {
        System.out.println(job.getJobName() + "MJobListener233执行成功, id 为:" + job.getJobId() + "完成度为:" + job.getProcessPercent());
    }

    @Override
    public void onProcess(StandJob job) {
        System.out.println(job.getJobName() + "MJobListener233正在执行, id 为:" + job.getJobId() + "完成度为:" + job.getProcessPercent());
    }
}


