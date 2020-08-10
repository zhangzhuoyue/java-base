package com.zzy.factorypattern.abstractmethod.template3.factoryimpl;

import com.zzy.factorypattern.abstractmethod.template3.factory.IDataFactory;
import com.zzy.factorypattern.abstractmethod.template3.operation.IDBCommand;
import com.zzy.factorypattern.abstractmethod.template3.operation.IDBConnection;
import com.zzy.factorypattern.abstractmethod.template3.operation.IDataReader;

/**
 * @author zhangyue666
 * @description
 * @date 2020/8/10 21:30
 */
public class MysqlIDataFactory implements IDataFactory {
    @Override
    public IDataReader getReader() {
        return null;
    }

    @Override
    public IDBCommand getCommand() {
        return null;
    }

    @Override
    public IDBConnection getConnection() {
        return null;
    }
}
