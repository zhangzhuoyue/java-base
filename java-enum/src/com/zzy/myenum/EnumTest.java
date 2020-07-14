package com.zzy.myenum;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        ResponseEnum errorAuthority = ResponseEnum.ERROR_AUTHORITY;

        //返回实例名称 toString()把枚举常量转换成字符串；
        String s = errorAuthority.toString();
        System.out.println(s);

        //返回成员变量值
        String code = errorAuthority.getCode();
        String msg = errorAuthority.getMsg();
        System.out.println(code +"     "+msg);

        //返回所有的枚举项
        ResponseEnum[] values = ResponseEnum.values();
        System.out.println(Arrays.toString(values));

        //int ordinal()：返回枚举常量在枚举类中声明的序号，第一个枚举常量序号为0；
        int ordinal = ResponseEnum.ERROR_AUTHORITY.ordinal();
        System.out.println(ordinal);

        //static T valueOf(Class enumType, String name)：把字符串转换成枚举常量。以指定枚举名称的方式获取枚举项。在枚举判断
        ResponseEnum responseEnum = Enum.valueOf(ResponseEnum.class, "SUCCESS_STATUS");
        System.out.println(responseEnum.toString());
        System.out.println(responseEnum.getCode());

    }
}
