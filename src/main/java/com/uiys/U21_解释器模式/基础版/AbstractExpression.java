package com.uiys.U21_解释器模式.基础版;

/**
 * 定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()。
 *
 * @author uiys
 * @date 2023/9/7
 */
public abstract class AbstractExpression {

    /**
     * 对指定的句子进行解析
     *
     * @param sentence 句子字符串
     */
    abstract boolean interpret(String sentence);

    /**
     * 对指定的句子进行解析
     *
     * @param sentence 句子字符串
     */
    abstract boolean interpretList(String sentence) throws IllegalAccessException;

}


