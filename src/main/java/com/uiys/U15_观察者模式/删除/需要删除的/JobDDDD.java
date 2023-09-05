package com.uiys.U15_观察者模式.删除.需要删除的;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class JobDDDD extends JobExecute {

    private Long _18M = 1024L * 1024L * 1;

    public JobDDDD(StandJob job) {
        super(job);
    }

    @Override
    public void doExecute(StandJob job, List<IJobListener> jobListeners) throws InterruptedException {
        Long totalSize = job.getTotalSize();
        Long finishSize = job.getFinishSize();
        Integer num = 0;
        while (finishSize < totalSize - _18M) {
            finishSize += _18M;
            for (IJobListener jobListener : jobListeners) {
                jobListener.onProcess(job);
                num++;
            }
            if (num > 5) {
                int i = num / 0;
            }
            job.setFinishSize(finishSize);
            TimeUnit.SECONDS.sleep(1);
        }
        for (IJobListener jobListener : jobListeners) {
            job.setFinishSize(finishSize + _18M);
            jobListener.onProcess(job);
        }
    }
}


