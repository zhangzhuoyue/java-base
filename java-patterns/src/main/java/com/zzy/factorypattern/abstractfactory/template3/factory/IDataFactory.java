package com.zzy.factorypattern.abstractfactory.template3.factory;

import com.zzy.factorypattern.abstractfactory.template3.operation.IDBCommand;
import com.zzy.factorypattern.abstractfactory.template3.operation.IDBConnection;
import com.zzy.factorypattern.abstractfactory.template3.operation.IDataReader;

/**
 * @author zhangyue666
 * @description 抽象工厂 创建一系列有关联对象
 * @date 2020/8/10 21:27
 */
public interface IDataFactory {

    public abstract IDataReader getReader();
    public abstract IDBCommand getCommand();
    public abstract IDBConnection getConnection();

}
