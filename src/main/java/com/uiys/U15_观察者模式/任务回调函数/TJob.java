package com.uiys.U15_观察者模式.任务回调函数;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author uiys
 * @date 2023/9/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TJob {
    /**
     * 任务Id
     */
    private Long id;

    /**
     * 任务名称
     */
    private String name;

    /**
     * 假设任务要传输的总数据量字节大小
     */
    private Long size;

    /**
     * 0: 待执行
     * 1: 执行成功
     * -1: 执行失败
     */
    private int status;

}


