package com.uiys.U21_解释器模式.基础版;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author uiys
 * @date 2023/9/7
 * 非终端解释器
 */

public class NoTerminalExpression extends AbstractExpression {

    /**
     * 表达式 1
     */
    private AbstractExpression expression1;
    /**
     * 表达式 2
     */
    private AbstractExpression expression2;
    /*
     *当然 后面也可以跟更多的表达式..
     */

    private List<AbstractExpression> abstractExpressions = new ArrayList<>();

    /**
     * 这个是构建出来的表达式, 这个表达式如果可以的话, (可以考虑一下 这个表达式的定义可不可以用列表定义.)
     *
     * @param expression1
     * @param expression2
     */
    public NoTerminalExpression(AbstractExpression expression1, AbstractExpression expression2) {
        this.expression1 = expression1;
        abstractExpressions.add(expression1);
        this.expression2 = expression2;
        abstractExpressions.add(expression2);
    }

    public NoTerminalExpression(List<AbstractExpression> expressionList) {
        this.abstractExpressions = expressionList;
    }

    @Override
    boolean interpret(String sentence) {
        return expression1.interpret(sentence) && expression2.interpret(sentence);
    }

    @Override
    boolean interpretList(String sentence) throws IllegalAccessException {
        boolean ret = true;
        for (AbstractExpression abstractExpression : this.abstractExpressions) {
            if (!abstractExpression.interpret(sentence)) {
                ret = false;
                break;
            }
        }
        return ret;
    }
}


