package com.uiys.U15_观察者模式.删除.需要删除的2;

/**
 * @author uiys
 * @date 2023/9/5
 */
public interface IJobListener {

    void processOn(JobDomain job);

    void successOn(JobDomain job);

    void failOn(JobDomain job, Throwable throwable);

}
