package com.uiys.U21_解释器模式.基础版;

/**
 * @author uiys
 * @date 2023/9/7
 */
public class TerminalExpressionOne extends AbstractExpression {

    /**
     * 单词, 简单起见, 这里句子不弄集合或数组了
     */
    private String word;

    public TerminalExpressionOne(String word) {
        this.word = word;
    }

    @Override
    boolean interpret(String sentence) {
        return sentence != null && sentence.contains(word);
    }

    @Override
    boolean interpretList(String sentence) {
        return sentence != null && sentence.contains(word);
    }
}


