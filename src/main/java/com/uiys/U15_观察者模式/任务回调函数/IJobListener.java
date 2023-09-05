package com.uiys.U15_观察者模式.任务回调函数;

/**
 * <p>任务监听器接口，主要监听任务是否执行成功、失败等</p>
 *
 * @author uiys
 * @date 2023/9/5
 */
public interface IJobListener {

    void onSuccess(TJob job);

    void onFail(TJob job,Throwable throwable);

    void onProcess(Long finishedSize, Long totalSize);

}
