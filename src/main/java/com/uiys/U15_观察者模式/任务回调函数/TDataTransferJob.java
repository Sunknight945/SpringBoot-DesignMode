package com.uiys.U15_观察者模式.任务回调函数;

import java.util.concurrent.TimeUnit;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class TDataTransferJob extends AJobExecutable {
    private static final long _10M = 1024 * 1024 * 10;

    /**
     * 为了简单起见，这个具体的任务执行子类里面就不放东西了
     * 正常情况下，这个类里面会有N多个业务实现或Dao层的类
     * 比如:AXXXService,BXXXService,CXXXDao,DXXXRepo...etc
     */

    public TDataTransferJob(TJob job) {
        super(job);
    }

    @Override
    protected void doExecute(TJob job, IJobListener listener) throws InterruptedException {
        Long totalSize = job.getSize();
        Long finished = _10M;
        while (finished < totalSize) {
            listener.onProcess(finished, totalSize);
            finished += 1024L * 1024L * 10;
            // 模拟数据传输过程, 间隔1秒
            TimeUnit.SECONDS.sleep(1);

        }
        // 推出while循环, 说明最后不满10M,再调用一次完成的进度回调
        listener.onProcess(totalSize, totalSize);
    }
}


