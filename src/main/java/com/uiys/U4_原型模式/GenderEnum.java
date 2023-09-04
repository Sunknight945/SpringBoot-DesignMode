package com.uiys.U4_原型模式;

/**
 * @author uiys
 * @date 2023/9/5
 */
public enum GenderEnum {

    MEAL(1, "男性"),

    FelMEAL(-1, "男性"),

    LGBT(0, "LGBT");

    private Integer code;

    private String msg;

    GenderEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}


