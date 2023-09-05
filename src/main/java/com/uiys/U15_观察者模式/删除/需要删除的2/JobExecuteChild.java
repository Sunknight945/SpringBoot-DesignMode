package com.uiys.U15_观察者模式.删除.需要删除的2;

import java.util.List;
import java.util.Optional;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class JobExecuteChild extends JobExecute {

    public JobExecuteChild(List<JobDomain> jobDomainList) {
        super(jobDomainList);
    }

    @Override
    protected void doExecute(List<JobDomain> jobDomains, List<IJobListener> jobListeners) {
        for (IJobListener jobListener : jobListeners) {
            for (JobDomain jobDomain : jobDomains) {
                try {
                    jobListener.processOn(jobDomain);
                    Optional.of(jobListener).ifPresent(l -> l.successOn(jobDomain));
                } catch (Exception e) {
                    Optional.ofNullable(jobListener).ifPresent(l -> l.failOn(jobDomain, e));
                }
            }
        }
    }
}


