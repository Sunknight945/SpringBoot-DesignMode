package com.uiys.U5_建造者模式.build;

import lombok.ToString;

/**
 * @author uiys
 * @date 2023/9/5
 */
@ToString
public class SomeObj {

    private String sId;
    private String sName;
    private String sWeight;

    public static SomeObj builder() {
        return new SomeObj();
    }

    public SomeObj setSId(String sId) {
        this.sId = sId;
        return this;
    }


    public SomeObj setSName(String sName) {
        this.sName = sName;
        return this;
    }


    public SomeObj setSWeight(String sWeight) {
        this.sWeight = sWeight;
        return this;
    }


}


