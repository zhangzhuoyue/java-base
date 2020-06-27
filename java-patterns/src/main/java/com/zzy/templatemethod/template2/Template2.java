package com.zzy.templatemethod.template2;

/**
 * @author zzy
 * @date 2020/6/27 21:20
 */

/**
 * 1. 应用开发人员实现自己需要实现的而业务行为。
 * 2. 主流程中的抽象方法【多态】调用自己的具体实现
 * 3. 基于面向对象编程，框架实现主流程，以及主流程中部分确定【稳定】方法，还有部分支持变化【不稳定】的方法，采用抽象方法【抽象的多态特性】。
 *    需要业务开发人员自己实现
 * 4. 面向对象编程是一种晚绑定，框架【早出现】调用业务开发人员的实现【晚出现】，基于template method,需要延迟技术，java中可以实现延时的方法：抽象，反射
 */
public class Template2 {

    public static void main(String[] args) {

        Library library = new Application();
        library.run();
    }
}
