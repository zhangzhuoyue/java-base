package com.zzy.factorypattern.abstractfactory.template3.operation;

/**
 * @author zhangyue666
 * @description 数据库连接基类
 * @date 2020/8/4 22:03
 */
public abstract class IDBConnection {
    public abstract void setConnection(IDBConnection connection);
}
