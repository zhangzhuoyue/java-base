package com.zzy.coordinationpattern.strategy.strategy2;

/**
 * @author zzy
 * @desc 税法计算类，对外提供提供的稳定的客户端
 * @date 2020/6/28 16:28
 */

/**
 * strategy客户端在全过程中是稳定的，对于算法子类变化。由抽象类隔离
 */
public class SalesOrder extends USTax {

    private TaxStrategy taxStrategy;

    /**
     * 这里传递工厂对象，有工厂决定传递哪个TaxStrategy,使用到工厂模式
     * @param taxStrategyFactory
     */
    public SalesOrder(TaxStrategyFactory taxStrategyFactory){
        this.taxStrategy = taxStrategyFactory.newStrategy();
    }

    public Double calaulate(Object object){
        //...
        //获取上限文信息
        taxStrategy.calculate(object);//多态调用，依赖于工厂返回哪个子类,减少了无用代码的加载，使得CPU缓存中可以加载更多有效执行代码片段
        return null;
    }
}
