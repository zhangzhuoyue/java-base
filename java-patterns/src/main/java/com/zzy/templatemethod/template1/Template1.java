package com.zzy.templatemethod.template1;

/**
 * @author zzy
 * @date 2020/6/27 19:10
 */
/**
 * application定义主流程
 * 1.application【晚实现】调用library【早实现】，晚实现调用早实现，叫早绑定。这种调用方式是结构化编程思想。
 * 2.库函数编写人员，编写部分不变的组成部分，应用开发人员编写自定义功能部分，同时需要自己编写应用程序的调用流程。
 * 3.这里使用java面向对象语言，但是使用的是结构化编程思想：分而治之，面向过程的思想，在面对需求变化，需要修改原有代码来实现功能。必然会冲击代码原有的结构
 * 4.这种结构化编程应对变化冲击的能力及比较差。
 */

public class Template1 {

    public static void main(String[] args) {
        new Template1().run();
    }

    /**
     * 开发人员往往依据给的程序示例代码，在库文件的基础上，加上自己功能代码。
     */
    public void run() {
        Application application = new Application();
        Library library = new Library();
        if (library.step1() == 1) {
            System.out.println(1);
        }
        if (application.step2() == 2) {
            System.out.println(2);
        }
        if (library.step3() == 3) {
            System.out.println(3);
        }

        if (application.step4() == 4) {
            System.out.println(4);
        }
        if (library.step5() == 5) {
            System.out.println(5);
        }
    }
}
