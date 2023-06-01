package com.appleyk.DMA5_建造者模式.DM5.http响应结果封装;

import com.appleyk.utils.JsonUtils;

public class BuilderTest {
    public static void main(String[] args) {
        /**
         * 这种建造者模式是将对象构建的步骤暴露出来，用户自己参对象的创建，通过建造者来实现，
         * 建造者每一个步骤完成后将返回自身，直到最后的链条调用build才真正去构建用户所需的对象
         * */
        MyResult result = new MyResult.Builder().status(404).data(null).message("data not found").build();
        System.out.println(JsonUtils.objectToJson(result));
    }
}
