package com.uiys.U15_观察者模式.删除.需要删除的2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        JobDomain B1 = new JobDomain("5", "B1", 1);
        JobDomain B11 = new JobDomain("8", "B11", 11);
        JobDomain B2 = new JobDomain("6", "B2", 2);
        JobDomain B3 = new JobDomain("7", "B3", 3);
        JobDomain B4 = new JobDomain("8", "B4", 4);

        List<JobDomain> jobDomainsB = new ArrayList<>();
        jobDomainsB.add(B1);
        jobDomainsB.add(B11);
        jobDomainsB.add(B2);
        jobDomainsB.add(B3);
        jobDomainsB.add(B4);
        JobExecute jobExecuteChild = new JobExecuteChild(jobDomainsB);
        List<JobExecute> jobExecuteList = new ArrayList<>();
        jobExecuteList.add(jobExecuteChild);
        List<IJobListener> iJobListeners = new ArrayList<>();
        iJobListeners.add(new JobListenerA());
        iJobListeners.add(new JobListenerA233());
        // jobExecuteChild.doExecute(jobDomainsB, iJobListeners);

        Thread thread = new Thread(new JobRunTable(jobExecuteList, iJobListeners));
        thread.start();
        thread.join();


    }

}


