package com.uiys.U1_工厂方法模式.material;

/**
 * @author uiys
 * @date 2023/9/4
 */
public class LowCar implements ICar {

    @Override
    public void run(Double runSpeed) {
        if (60 > runSpeed) {
            System.out.printf(String.format("low 车跑 %s(Km/h), %s", runSpeed, "轻松! \n"));
        } else if (60 <= runSpeed && runSpeed < 90) {
            System.out.printf(String.format("low 车跑 %s(Km/h), %s", runSpeed, "不容易! \n"));
        } else if (runSpeed >= 90) {
            System.out.printf(String.format("low 车跑 %s(Km/h), %s", runSpeed, "不可能! \n"));
        }
    }
}


