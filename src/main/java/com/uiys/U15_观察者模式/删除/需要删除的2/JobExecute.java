package com.uiys.U15_观察者模式.删除.需要删除的2;

import java.util.List;

/**
 * @author uiys
 * @date 2023/9/5
 */
public abstract class JobExecute {

    public List<JobDomain> jobDomains;

    public JobExecute() {
        super();
    }

    public JobExecute(List<JobDomain> jobDomains) {
        this.jobDomains = jobDomains;
    }

    public void execute(List<IJobListener> jobListeners) {
        doExecute(jobDomains, jobListeners);
    }

    protected abstract void doExecute(List<JobDomain> jobDomains, List<IJobListener> jobListeners);

}
