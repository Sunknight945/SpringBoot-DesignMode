package com.uiys.U15_观察者模式.标准简易版;

/**
 * @author uiys
 * @date 2023/9/5
 */
public class Test {
    public static void main(String[] args) {
        // 1、抽象的、标准的、简易的通知调用
        // observerAndNotify();
        System.out.println("========================================");

    }



    private static void observerAndNotify() {
        AbstractSubject abstractSubject = new MySubject();
        abstractSubject.add(new ObserverA());
        abstractSubject.add(new ObserverB());
        abstractSubject.extend();
    }

}


