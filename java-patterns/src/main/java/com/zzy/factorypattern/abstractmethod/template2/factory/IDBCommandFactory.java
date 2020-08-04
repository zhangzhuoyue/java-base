package com.zzy.factorypattern.abstractmethod.template2.factory;

import com.zzy.factorypattern.abstractmethod.template2.operation.IDBCommand;

/**
 * @author zhangyue666
 * @description 数据库命令执行工厂类
 * @date 2020/8/4 22:03
 */
public abstract class IDBCommandFactory {

    public abstract IDBCommand idbCommand();
}
