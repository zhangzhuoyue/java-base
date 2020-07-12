package com.zzy.coordinationpattern.strategy.strategy2;

/**
 * @author zzy
 * @deprecated 税法的抽象父类
 * @date 2020/6/28 16:23
 */

/**
 * 使用基于抽象类的方法，应对未来变化，使用扩展完成，遵循开发封闭原则
 */
public abstract  class TaxStrategy {
    /**
     * 参数用来传递上限文参数信息
     * @param object
     * @return
     */
    protected abstract Double calculate(Object object);
}
