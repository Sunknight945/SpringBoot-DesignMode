package com.uiys.U15_观察者模式.删除.需要删除的2;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Objects;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class JobDomain {

    /**
     * job的uuid
     */
    @Getter
    private String jobId;

    /**
     * job名称
     */
    @Getter
    private String jobName;

    /**
     * job名称
     */
    @Getter
    @Setter
    private Integer processNum;
    /**
     * 失败:   -1
     * 未开始:  0
     * 成功是:  1
     */
    @Getter
    private Integer jobStatus;

    /**
     * 开始时间
     */
    private Date jobStartTime;

    /**
     * 完成时间
     */
    private Date jobFinishTime;

    /**
     * 花费时间
     */
    private Long jobCostTime;

    public JobDomain(String jobId, String jobName, Integer processNum) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobStatus = 0;
        this.processNum = processNum;
        this.jobStartTime = new Date();
    }

    public void jobFinished() {
        this.jobStatus = 1;
        this.jobFinishTime = new Date();
        this.jobCostTime = this.jobFinishTime.getTime() - this.jobStartTime.getTime();
    }

    public String getCostTime() {
        long cosL;
        if (Objects.nonNull(jobCostTime)) {
            cosL = jobCostTime;
        } else {
            cosL = System.currentTimeMillis() - this.jobStartTime.getTime();
        }
        return new BigDecimal(cosL).divide(new BigDecimal(1000L), 2, RoundingMode.HALF_UP).toString();
    }

}


