package com.uiys.U20_状态模式.猫科A_组合_状态;

import com.uiys.U20_状态模式.猫科A_组合_状态.animal.Car;
import com.uiys.U20_状态模式.猫科A_组合_状态.animal.Lion;
import com.uiys.U20_状态模式.猫科A_组合_状态.behavior.CanNotClimb;

/**
 * @author uiys
 * @date 2023/9/6
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.aboutClimb();
        car.aboutSwim();

        Lion lion = new Lion(new CanNotClimb());
        lion.aboutClimb();
        lion.aboutSwim();


    }

}


