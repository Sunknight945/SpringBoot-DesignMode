package com.uiys.U1_工厂方法模式.material;

/**
 * @author uiys
 * @date 2023/9/4
 */
public class MidCar implements ICar {

    @Override
    public void run(Double runSpeed) {
        if (90 > runSpeed) {
            System.out.printf(String.format("Mid 车跑 %s(Km/h), %s", runSpeed, "轻松! \n"));
        } else if (90 <= runSpeed && runSpeed < 190) {
            System.out.printf(String.format("Mid 车跑 %s(Km/h), %s", runSpeed, "不容易! \n"));
        } else if (runSpeed >= 190) {
            System.out.printf(String.format("Mid 车跑 %s(Km/h), %s", runSpeed, "不可能! \n"));
        }
    }
}


