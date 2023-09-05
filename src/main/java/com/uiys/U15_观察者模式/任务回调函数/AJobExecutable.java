package com.uiys.U15_观察者模式.任务回调函数;

import java.util.Optional;

/**
 * <p>抽象一个可执行的任务类，主要就是把任务执行的方法进行抽取封装（其中用到了模板方法）</p>
 *
 * @author uiys
 * @date 2023/9/5
 */
public abstract class AJobExecutable {

    // 任务对象
    private final TJob job;

    public AJobExecutable(TJob job) {
        this.job = job;
    }

    public void execute(IJobListener listener) {
        try {
            doExecute(job, listener);
            Optional.ofNullable(listener).ifPresent(l -> l.onSuccess(job));
        } catch (Exception e) {
            Optional.ofNullable(listener).ifPresent(l -> l.onFail(job, e));
        }
    }

    /**
     * 这个方法留给具体的执行任务来实现(必须实现)
     *
     * @param job
     * @param listener
     */
    protected abstract void doExecute(TJob job, IJobListener listener) throws InterruptedException;

}


