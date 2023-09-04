package com.uiys.U1_工厂方法模式.material;

/**
 * @author uiys
 * @date 2023/9/4
 */
public class TopCar implements ICar {

    @Override
    public void run(Double runSpeed) {
        if (190 > runSpeed) {
            System.out.printf(String.format("Top 车跑 %s(Km/h), %s", runSpeed, "轻松! \n"));
        } else if (190 <= runSpeed && runSpeed < 290) {
            System.out.printf(String.format("Top 车跑 %s(Km/h), %s", runSpeed, "不容易! \n"));
        } else if (runSpeed >= 290) {
            System.out.printf(String.format("Top 车跑 %s(Km/h), %s", runSpeed, "有可能! \n"));
        }
    }

}

