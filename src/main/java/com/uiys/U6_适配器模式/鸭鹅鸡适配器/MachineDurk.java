package com.uiys.U6_适配器模式.鸭鹅鸡适配器;

/**
 * @author uiys
 * @date 2023/9/5
 * 机器鹅不能叫, 但是可以发声!
 */
public class MachineDurk implements PlayMusic {
    @Override
    public void play() {
        System.out.println("机器鹅 播放了: 嗷嗷嗷嗷嗷");
    }
}


