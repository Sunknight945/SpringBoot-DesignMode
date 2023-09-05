package com.uiys.U15_观察者模式.删除.需要删除的;

import java.util.List;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class JobTable implements Runnable {

    private JobExecute job;

    private List<IJobListener> jobListeners;

    public JobTable(JobExecute job, List<IJobListener> jobListeners) {
        this.job = job;
        this.jobListeners = jobListeners;
    }

    @Override
    public void run() {
        job.execute(jobListeners);
    }
}


