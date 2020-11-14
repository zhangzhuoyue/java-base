package com.zzy.interface_isolation.proxy;

/**
 * @author zhangyue666
 * @description
 * @date 2020/8/25 22:22
 */
public class ProxyISubject implements ISubject {
    private ISubject iSubject;//不一定会注入对象

    public ProxyISubject(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void process() {
        System.out.println("zhongwen");
    }
}
