package com.uiys.U5_建造者模式.bike;

import lombok.Data;

/**
 * @author uiys
 * @date 2023/9/5
 */
@Data
public class ZhangSanBike implements Ibike {

    private String createName;

    ZhangSanBike() {
        this.createName = "张三";
    }

    public void preStall() {
        System.out.println("准备好铝架");
    }

    public void preWheels() {
        System.out.println("准备好轮子");
    }

    public void preShaChe() {
        System.out.println("准备好刹车");
    }

    public void assembler() {
        System.out.println("开始组装");
    }

    public void finish() {
        System.out.println("组装完毕");
    }

    /**
     * @return
     */
    @Override
    public ZhangSanBike createBike() {
        preStall();
        preWheels();
        preShaChe();
        assembler();
        finish();
        return new ZhangSanBike();
    }
}


