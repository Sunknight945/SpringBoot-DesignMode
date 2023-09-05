package com.uiys.U15_观察者模式.删除.需要删除的;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class MJobListener implements IJobListener {

    @Override
    public void onFail(StandJob job, Throwable throwable) {
        System.out.println(job.getJobName() + "执行失败, id 为:" + job.getJobId() + "完成度为:" + job.getProcessPercent());
        job.setJobStatus(-1);
        System.out.print(throwable);
    }

    @Override
    public void onSuccess(StandJob job) {
        System.out.println(job.getJobName() + "执行成功, id 为:" + job.getJobId() + "完成度为:" + job.getProcessPercent());
        job.setJobStatus(1);
    }

    @Override
    public void onProcess(StandJob job) {
        System.out.println(job.getJobName() + "正在执行, id 为:" + job.getJobId() + "完成度为:" + job.getProcessPercent());
    }
}


