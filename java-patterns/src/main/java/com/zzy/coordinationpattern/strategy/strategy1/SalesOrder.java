package com.zzy.coordinationpattern.strategy.strategy1;

/**
 * @author zzy
 * @date 2020/6/28 16:02
 */
public class SalesOrder {

    private TaxBase taxBase;

    public Double calculate(){
        if (taxBase == TaxBase.CN_tax){
            //CN ***
        }
        else if (taxBase == TaxBase.DE_tax){  //更改
            //DE****
        }
        /**
         *    重构技法：从时间轴角度看待问题的变化。
         *             随着后期需求改变，需要增加新的税款计算，则要在上面代码基础上添加的新的处理算法。
         *    开闭原则：在软件开发中，在原有代码片段上增加新的代码，往往会打破上面的代码规则，造成bug。
         *             根据开闭原则方式：面对未来变化，使用扩展的方式完成需求，
         *    分而治之死的结构化编程思想：if..else是典型的结构化编程，如果遇到不变的条件【一个星期有七天】，则使用if...else是合适的，
         *                              但是，如果从发展的角度，判断条件可能会增加，则考虑使用strategy模式，它同时减少代码运行时加载代码量
         *
         *    从变化角度：增加新的功能，需要在原有代码上修改，打破的开闭原则。
         */

        return null;
    }
}
