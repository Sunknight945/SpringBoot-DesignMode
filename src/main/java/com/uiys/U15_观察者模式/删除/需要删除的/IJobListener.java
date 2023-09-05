package com.uiys.U15_观察者模式.删除.需要删除的;

/**
 * @author uiys
 * @date 2023/9/5
 */
public interface IJobListener {

    void onFail(StandJob job,Throwable throwable);

    void onSuccess(StandJob job);

    void onProcess(StandJob job);



}
