package com.uiys.U6_适配器模式.鸭鹅鸡适配器;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.similarQuack(new Chicken());
        test.similarQuack(new Durk());

        MachineDurkAdepter machineDurkAdepter = new MachineDurkAdepter(new MachineDurk());
        test.similarQuack(machineDurkAdepter);
    }

    public void similarQuack(Quackable quackable){
        quackable.quack();
    }



}


