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