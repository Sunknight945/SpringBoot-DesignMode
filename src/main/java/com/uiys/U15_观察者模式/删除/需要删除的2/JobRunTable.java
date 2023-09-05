package com.uiys.U15_观察者模式.删除.需要删除的2;

import java.util.Iterator;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class JobRunTable implements Runnable {

    private List<JobExecute> jobExecutes;
    private List<IJobListener> jobListener;

    public JobRunTable(List<JobExecute> jobExecutes, List<IJobListener> jobListener) {
        this.jobExecutes = jobExecutes;
        this.jobListener = jobListener;
    }

    @Override
    public void run() {
        Iterator<JobExecute> iterator = jobExecutes.iterator();
        while (iterator.hasNext()) {
            JobExecute next = iterator.next();
            next.execute(jobListener);
        }
    }
}


