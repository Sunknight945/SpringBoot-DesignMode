package com.uiys.U4_原型模式;

/**
 * @author uiys
 * @date 2023/9/5
 */
public enum HealthyLeve {

    BAD(-1, "坏"),
    NORMAL(0, "正常"),
    GOOD(1, "良好");

    private Integer code;

    private String msg;

    HealthyLeve(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}


