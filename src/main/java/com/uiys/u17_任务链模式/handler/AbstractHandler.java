package com.uiys.u17_任务链模式.handler;

import lombok.Getter;
import lombok.Setter;

/**
 * @author uiys
 * @date 2023/9/6
 */
public abstract class AbstractHandler<E, F> {

    @Getter
    @Setter
    public E data;

    @Getter
    @Setter
    public AbstractHandler<E, F> nextHandler = null;

    public abstract E filter(F filter);

    public Object process(AbstractHandler handler, F filter) {
        AbstractHandler nextHandler = handler;
        Object data = handler.getData();
        while (null != nextHandler) {
            nextHandler.setData(data);
            data = nextHandler.filter(filter);
            nextHandler = nextHandler.getNextHandler();
        }
        return data;
    }

}


