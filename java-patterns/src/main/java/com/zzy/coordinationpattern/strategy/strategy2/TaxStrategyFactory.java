package com.zzy.coordinationpattern.strategy.strategy2;

/**
 * @author zzy
 * @desc 税法工厂类 根据条件生产具体的税法
 * @date 2020/6/28 16:53
 */
public interface TaxStrategyFactory {

    TaxStrategy newStrategy();
}
