package com.uiys.U5_建造者模式.build;

import lombok.ToString;

import java.util.Date;

/**
 * @author uiys
 * @date 2023/9/5
 */
@ToString
public class TrueSomeBuilderObj {

    private String uuid;

    private Date createTime;

    private String name;

    private String createUserId;

    private String modifyUserId;

    public TrueSomeBuilderObj(TrueSomeBuilderObj.Builder builder) {
        this.uuid = builder.uuid;
        this.createTime = builder.createTime;
        this.name = builder.name;
        this.createUserId = builder.createUserId;
        this.modifyUserId = builder.modifyUserId;
    }

    public static class Builder {
        private String uuid;
        private Date createTime;
        private String name;
        private String createUserId;
        private String modifyUserId;

        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder createUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        public Builder modifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }

        public TrueSomeBuilderObj build() {
            return new TrueSomeBuilderObj(this);
        }



    }

}


