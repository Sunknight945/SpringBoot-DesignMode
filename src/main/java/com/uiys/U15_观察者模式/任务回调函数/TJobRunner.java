package com.uiys.U15_观察者模式.任务回调函数;

/**
 * <p>任务执行线程</p>
 *
 * @author uiys
 * @date 2023/9/5
 */
public class TJobRunner implements Runnable {

    private final AJobExecutable job;

    private final IJobListener listener;

    public TJobRunner(AJobExecutable job, IJobListener listener) {
        this.job = job;
        this.listener = listener;
    }

    @Override
    public void run() {
        job.execute(listener);
    }
}


