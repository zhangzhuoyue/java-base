####元注解  
1. @Target
2. @Documented
3. @Retention
    ```java
       public @interface Service{
              String[] value() default "unknown";//传递多个值,使用默认权限修饰符，或public
              //String   value() default "unknown";//传递一个值
       }
    ```

####自定义注解中的权限修饰符，枚举的使用
1. 可使用默认修饰符  ，public；spring中使用默认修饰符
2. 枚举可引用外部，也可使用内部创建的
3. 自定义注解的参数名，在赋值时保持一致，如果不写默认是value，
4. 自定义注解参数需要默认值。

##注解手册
    1. https://www.html.cn/doc/jsdoc/tags-name.html
    
## 注解的使用场景
1. https://www.jianshu.com/p/a7bedc771204
1. https://blog.csdn.net/qq_39964694/article/details/81183701

#### 自定义注解的使用
1. 扫描包下的所有的类
2. 检测到使用注解，则使用注解指定的参数。

#### 自定义注解使用场景
1. 日志拦截
2. 权限验证
3.    
      ```      
         类属性自动赋值
         验证对象属性完整性
         代替配置文件功能（例如spring基于注解的配置）
   ```
     




