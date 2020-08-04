package com.zzy.factorypattern.abstractmethod.template1;

import java.util.List;

/**
 * @author zhangyue666
 * @description 调用数据库
 * @date 2020/8/4 21:50
 */
public class EmployeeDao {

    public List<Object> getEmployee(){
        /**
         * 代码客户端使用连接mysql数据库进行操作，如果要换成其他数据库，
         * 则这段代码不使用，意味着该客户端是不稳定的。
         *
         * 客户端代码中存在new，意味着存在编译时依赖，使得客户端和具体的数据库操作紧耦合。
         * 对象创建导致的紧耦合，首先想到使用运行时依赖，是客户端依赖抽象 -->面向接口编程。
         *
         * 面向接口编程，首先，定义接口
         *
         * SalConnection connection = new SqlConnection();
         * connection.ConnectionString = "...";
         *
         * SqlComment comment = new SqlCommand();
         * comment.CommandText="...";
         *
         * SqlDataReader readwe = command.ExecuteReader();
         * while(reader.Reader()){
         *
         * }
         */
        return null;
    }
}
