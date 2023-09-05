package com.uiys.U15_观察者模式.删除.需要删除的;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.NumberFormat;
import java.util.Objects;

/**
 * @author uiys
 * @date 2023/9/5
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class StandJob {

    private String jobId;

    private Integer jobStatus;

    private String jobName;

    private Long totalSize;

    private Long finishSize;

    public String getProcessPercent() {
        String getProcessPercent = "0%";
        if (Objects.nonNull(this.finishSize) && Objects.nonNull(this.totalSize)) {
            NumberFormat instance = NumberFormat.getInstance();
            instance.setMaximumFractionDigits(3);
            getProcessPercent = instance.format(((float)this.finishSize / (float)this.totalSize * 100));
        }
        return getProcessPercent;
    }

}


