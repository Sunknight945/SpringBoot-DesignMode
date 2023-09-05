package com.uiys.U15_观察者模式.任务回调函数;

import java.text.NumberFormat;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        TJob tJob = TJob.builder().id(233L).status(0).name("一个传输任务").size(1024 * 1024 * 110L).build();

        Thread thread = new Thread(new TJobRunner(new TDataTransferJob(tJob), new IJobListener() {
            @Override
            public void onSuccess(TJob job) {
                job.setStatus(1);
                System.out.println("======= 数据传输完毕 =======");
            }

            @Override
            public void onFail(TJob job, Throwable throwable) {
                job.setStatus(-1);
                System.out.println("数据传输异常：" + throwable.getMessage());
            }

            @Override
            public void onProcess(Long finishedSize, Long totalSize) {
                NumberFormat numberFormat = NumberFormat.getInstance();
                numberFormat.setMaximumFractionDigits(2);
                String percent = numberFormat.format((float)finishedSize / (float)totalSize * 100);
                System.out.printf("已传输：%d，当前进度：%s%s\n", finishedSize, percent, "%");
            }
        }));

        thread.start();
        // thread.join();
        System.out.println("任务名称：" + tJob.getName() + "传输结束，任务状态：" + tJob.getStatus());

    }

}


