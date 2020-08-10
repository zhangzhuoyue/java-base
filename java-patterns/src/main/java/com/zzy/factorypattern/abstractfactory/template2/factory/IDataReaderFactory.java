package com.zzy.factorypattern.abstractfactory.template2.factory;

import com.zzy.factorypattern.abstractfactory.template2.operation.IDataReader;

/**
 * @author zhangyue666
 * @description 数据数据库工厂类
 * @date 2020/8/4 22:05
 */
public abstract  class IDataReaderFactory {

    public abstract IDataReader iDataReader();
}
