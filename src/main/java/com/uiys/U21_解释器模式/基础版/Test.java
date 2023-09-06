package com.uiys.U21_解释器模式.基础版;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author uiys
 * @date 2023/9/7
 */
public class Test {

    public static void main(String[] args) throws IOException, IllegalAccessException {
        Content content = new Content();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("请输入:");
            String s = bufferedReader.readLine();
            if ("q".equals(s)) {
                break;
            }
            content.operation(s);
        }



    }

}


