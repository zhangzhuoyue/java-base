package com.zzy.factorypattern.abstractmethod.template2.factory;

import com.zzy.factorypattern.abstractmethod.template2.operation.IDBConnection;

/**
 * @author zhangyue666
 * @description 数据库连接工厂类
 * @date 2020/8/4 22:03
 */
public abstract class IDBConnectionFactory {

    public abstract IDBConnection idbConnection();
}
