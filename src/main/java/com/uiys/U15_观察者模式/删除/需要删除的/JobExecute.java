package com.uiys.U15_观察者模式.删除.需要删除的;

import java.util.List;

/**
 * @author uiys
 * @date 2023/9/5
 */
public abstract class JobExecute {

    private StandJob job;

    public JobExecute(StandJob job) {
        this.job = job;
    }

    public void execute(List<IJobListener> jobListeners) {
        try {
            doExecute(job, jobListeners);
            jobListeners.forEach(l -> l.onSuccess(job));
        } catch (Exception e) {
            jobListeners.forEach(l->l.onFail(job,e));
        }

    }

    public abstract void doExecute(StandJob job, List<IJobListener> jobListeners) throws Exception;

}


