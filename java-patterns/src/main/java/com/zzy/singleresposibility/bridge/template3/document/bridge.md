1. 强Messager 的功能拆分，不同抽象类职责单一，bridge:一个类继承另一个类，但没有实现里面所有的方法，说明该抽象类中部分功能不是一个职责的。同时MessageLite、MessagePerfert 他们有相同的属性，从代码重复角度，可以向上抽取。
然后让MessageLite、MessagePerfert 继承这个抽象类。这放在template4中修改

2. 将重复部分向上抽取，会出现和装饰着模式相似的结构，将公共属性抽取到Meaasger中(装饰者模式将相同的属性抽象到新建的抽象中，该抽象同时在继承一个接口【接口规范】)