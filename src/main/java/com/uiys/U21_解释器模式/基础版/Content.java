package com.uiys.U21_解释器模式.基础版;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/7
 */
@Slf4j
public class Content {

    private String word1 = "解释器";
    private String word2 = "设计模式";

    private AbstractExpression expression;

    public Content() {
        expression = new NoTerminalExpression(new TerminalExpressionOne(word1), new TerminalExpressionOne(word2));
    }

    public Content(AbstractExpression expression) {
        // List<AbstractExpression> abstractExpressions = new ArrayList<>();
        // abstractExpressions.add(new TerminalExpressionOne("你好嘛"));
        // abstractExpressions.add(new TerminalExpressionTwo("我很好"));
        // this.expression = new NoTerminalExpression(abstractExpressions);
        this.expression = expression;
    }

    public Content(String word1, String word2) {
        this();
        this.word1 = word1;
        this.word2 = word2;
    }

    public void operation(String sentence) throws IllegalAccessException {
        // boolean bMatch = expression.interpret(sentence);
        boolean bMatch = expression.interpretList(sentence);
        log.info("句子是否和解释器设计模式有关{}", (bMatch ? "有" : "没有"));
    }

}


