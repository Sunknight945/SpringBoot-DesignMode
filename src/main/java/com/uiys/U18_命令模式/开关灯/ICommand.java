package com.uiys.U18_命令模式.开关灯;

/**
 * 命令接口
 *
 * @author uiys
 * @date 2023/9/6
 */
public interface ICommand {

    /**
     * 执行, 屏蔽执行的细节, 将请求和调用者解耦
     */
    void execute();

    /**
     * 撤销, 常规支持
     */
    void undo();
}


