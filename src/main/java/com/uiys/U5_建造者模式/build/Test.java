package com.uiys.U5_建造者模式.build;

import java.util.Date;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {
    public static void main(String[] args) {
        SomeObj obj = SomeObj.builder().setSWeight("500Kg").setSId("233");
        obj.setSName("nihcma");
        System.out.println(obj);

        TrueSomeBuilderObj build = new TrueSomeBuilderObj.Builder().uuid("nihc").createTime(new Date()).createUserId("uiys").modifyUserId(null).build();
        System.out.println(build);

    }


}


