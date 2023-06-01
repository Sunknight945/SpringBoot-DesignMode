package com.appleyk.DMA5_建造者模式.DM5;

/**
 * <p>蛋糕师 == 根据builder定义的制作工序制作蛋糕</p>
 *
 * @author Appleyk
 * @version v0.1.2
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:53 2018-11-9
 */
public class CakeBuilder implements ICakeBuilder {

    /**蛋糕师傅的姓名*/
    private String name;

    /**蛋糕师要制作的蛋糕，蛋糕师不关心蛋糕最后去了哪，他只需要把做好的蛋糕放在货架上即可*/
    private Cake cake = new Cake();

    public CakeBuilder() {
    }

    public CakeBuilder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void knead() {
        cake.addProcess("揉面 -- 软软的，滑滑的");
    }

    @Override
    public void ferment() {
        cake.addProcess("发酵 -- 酵一酵");
    }

    @Override
    public void bake(int minutes) {
        cake.addProcess("烘烤 -- " + minutes + "分钟");
    }

    @Override
    public Cake getCake() {
        /**
         * 由于制作蛋糕的工序太过复杂，所以蛋糕师傅需要按步骤一步步来，即将复杂的工艺化简为一步步简单的工序
         * 写到这里，是不是感觉这个思想跟门面（外观）模式有点像，都是屏蔽复杂逻辑，让Client端用的舒服用的简单用的爽
         */
        knead();
        ferment();
        bake(30);
        return this.cake;
    }
}
